package com.school.schoConnectapp.controller;

import com.school.schoConnectapp.entity.User;
import com.school.schoConnectapp.service.SignUpService;
import com.school.schoConnectapp.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@Slf4j
public class SignUpController {

    @Autowired
    private SignUpService signUpService;

    @GetMapping("/signup")
    public ModelAndView showSignUpPage(){
        log.info("Fetching details from the page!");
        ModelAndView modelAndView = new ModelAndView("/signup");
        modelAndView.addObject("newUser", new User());
        return  modelAndView;
    }

    @PostMapping("/signup")
    public ModelAndView signup(User user) {
        signUpService.saveNewUserDetails(user);
        return new ModelAndView("redirect:/login");
    }
}
