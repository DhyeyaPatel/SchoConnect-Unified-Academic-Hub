package com.school.schoConnectapp.service;

import com.school.schoConnectapp.entity.User;
import com.school.schoConnectapp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User getUserName(String userName){
        return userRepository.findByUserName(userName);
    }
}
