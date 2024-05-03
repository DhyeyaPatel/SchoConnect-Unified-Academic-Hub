package com.school.schoConnectapp.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@Slf4j
public class LogInController {

    @GetMapping(value = {"/","/login"})
    public ModelAndView logInController(){
        log.info("Entering login controller");
        ModelAndView modelAndView = new ModelAndView("newLogin");
        return modelAndView;
    }

    @GetMapping(value = "/home")
    public ModelAndView homeController(){
        log.info("Entering home controller");
        ModelAndView modelAndView = new ModelAndView("home");
        return modelAndView;
    }

    @GetMapping(value = "/manage")
    @PreAuthorize("hasAuthority('PROFESSOR')")
    public ModelAndView manageStudents(){
        log.info("Entering manage students controller");
        ModelAndView modelAndView = new ModelAndView("manage");
        return modelAndView;
    }

}
