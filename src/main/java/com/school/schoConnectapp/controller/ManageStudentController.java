package com.school.schoConnectapp.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@Slf4j
public class ManageStudentController {

    @GetMapping(value = "/manage")
    @PreAuthorize("hasAuthority('PROFESSOR')")
    public ModelAndView manageStudents(){
        log.info("Entering manage students controller");
        ModelAndView modelAndView = new ModelAndView("manage");
        return modelAndView;
    }
}
