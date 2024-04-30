package com.school.schoConnectapp.security.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SchoConnectConfig{

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http.authorizeHttpRequests()
                .requestMatchers("/","/login", "/css/**", "/js/**")
                .permitAll()
                .requestMatchers("/home")
                .authenticated()
                .and()
                .csrf().disable()
                .formLogin().loginPage("/login")
                .defaultSuccessUrl("/home").usernameParameter("Email").passwordParameter("Password");
        return http.build();
    }
}
