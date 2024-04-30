package com.school.schoConnectapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LogInController {

    @GetMapping(value = {"/","/login"})
    public ModelAndView logInController(){
        ModelAndView modelAndView = new ModelAndView("newLogin");
        return modelAndView;
    }

//    @GetMapping(value = "/home")
//    public String homeController(){
//        return "Hello World!!!";
//    }

}
