package com.autowired.autowired.controllers;

import com.autowired.autowired.initializers.Forwarder;
import com.autowired.autowired.services.AutobotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AutowiredController {

    @Autowired
    @Qualifier(value = "robotImpl")
    AutobotService service;

    @GetMapping("/auto")
    public String findAccessName(){
        return service.getAutobotsFullName();
    }

}
