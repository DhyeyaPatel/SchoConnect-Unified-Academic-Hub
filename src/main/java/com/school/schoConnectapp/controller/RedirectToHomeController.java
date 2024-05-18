package com.school.schoConnectapp.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@Slf4j
public class RedirectToHomeController {

    @GetMapping(value = "/home")
    public ModelAndView homeController(){
        log.info("Entering home controller");
        ModelAndView modelAndView = new ModelAndView("home");
        return modelAndView;
    }
}
