package com.school.schoConnectapp.security.config;

import com.school.schoConnectapp.security.impl.UserDetailsServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
@Slf4j
public class SchoConnectConfig{

    @Autowired
    private UserDetailsServiceImpl userDetailsServiceImpl;

    @Bean
    public AuthenticationProvider authenticationProvider() {
        DaoAuthenticationProvider authProvider = new DaoAuthenticationProvider();
        authProvider.setUserDetailsService(userDetailsServiceImpl);
        authProvider.setPasswordEncoder(passwordEncoder());
        return authProvider;
    }

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http.authorizeHttpRequests()
                .requestMatchers("/", "/login", "/css/**", "/js/**").permitAll()
                .requestMatchers("/home").authenticated()
                .requestMatchers("/manage").hasAuthority("PROFESSOR")
                .requestMatchers("/signup").permitAll()
                .and().csrf().disable()
                .formLogin().loginPage("/login").permitAll()
                .defaultSuccessUrl("/home").usernameParameter("username").passwordParameter("password")
                .and().logout().logoutUrl("/logout").logoutSuccessUrl("/goodbye").permitAll();

                /*.and().exceptionHandling().accessDeniedPage("/accessDenied")*/
        return http.build();
    }

    @Bean
    public BCryptPasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }
}
