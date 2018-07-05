package com.autowired.autowired.controllers;

import com.autowired.autowired.initializers.Forwarder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AutowiredController {

    @Autowired
    private Forwarder forwarder;

    @GetMapping("/auto")
    public String findAccessName(){
        return forwarder.forwardDataToController();
    }

}
