package com.school.schoConnectapp.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@Slf4j
public class LogInLogOutController {

    @GetMapping(value = {"/","/login"})
    public ModelAndView logInController(){
        log.info("Entering login controller");
        ModelAndView modelAndView = new ModelAndView("login");
        return modelAndView;
    }

    @GetMapping(value = "/accessDenied")
    public ModelAndView accessDenied(){
        log.error("Access is Denied for the user");
        ModelAndView modelAndView = new ModelAndView("accessDenied");
        return modelAndView;
    }

    @GetMapping(value = "/goodbye")
    public ModelAndView logoutController(){
        log.info("Entering LogoutController");
        ModelAndView view = new ModelAndView("logout");
        return view;
    }

}
