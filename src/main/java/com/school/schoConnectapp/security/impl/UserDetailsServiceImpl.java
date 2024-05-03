package com.school.schoConnectapp.security.impl;

import com.school.schoConnectapp.entity.Role;
import com.school.schoConnectapp.entity.User;
import com.school.schoConnectapp.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@Slf4j
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private UserService userService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        User user = userService.getUserName(username);
        log.info("username: "+user.getUserName() + "password: "+user.getPassword());
        user.getRoles().forEach(role -> log.info("role : {}",role.getRoleName()));
        if(user == null)
            throw new UsernameNotFoundException("User : "+username+ " not found");

        Set<GrantedAuthority> authorities = new HashSet<>();

        for (Role role:user.getRoles()) {
            authorities.add(new SimpleGrantedAuthority(role.getRoleName()));
        }
        log.info("returning user details");
        return new org.springframework.security.core.userdetails
                .User(user.getUserName(),user.getPassword(),authorities);

    }
}
