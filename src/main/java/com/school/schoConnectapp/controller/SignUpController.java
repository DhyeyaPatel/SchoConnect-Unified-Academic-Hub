package com.school.schoConnectapp.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@Slf4j
public class SignUpController {

    @GetMapping("/signup")
    public ModelAndView signUp(){
        log.info("Fetching details from the page!");
        ModelAndView modelAndView = new ModelAndView("/signup");
        return  modelAndView;
    }
}
