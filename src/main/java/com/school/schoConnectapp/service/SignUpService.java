package com.school.schoConnectapp.service;

import com.school.schoConnectapp.entity.Role;
import com.school.schoConnectapp.entity.SignUpDto;
import com.school.schoConnectapp.entity.User;
import com.school.schoConnectapp.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class SignUpService {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public void saveNewUserDetails(SignUpDto newUserDetails) {
        log.info("Encoding Password");
        User user = new User();
        user.setFirstName(newUserDetails.getFirstName())
                .setLastName(newUserDetails.getLastName())
                .setUserName(newUserDetails.getUserName())
                .setEmail(newUserDetails.getEmail())
                .setPassword(passwordEncoder.encode(newUserDetails.getPassword()));
        Role role = new Role();
        role.setRoleName(newUserDetails.getRoleName());
        role.setUser(user);
        log.info(role.toString());
        user.getRoles().add(role);
        log.info("Saving New User Details");
        userRepository.save(user);
    }
}
