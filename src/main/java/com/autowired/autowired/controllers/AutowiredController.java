package com.autowired.autowired.controllers;

import com.autowired.autowired.feed.DataFeed;
import com.autowired.autowired.services.AutobotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AutowiredController {

    @Autowired
    AutobotService robotImpl;

    DataFeed df;

    @GetMapping("/auto")
    public String findAccessName(){
        //return robotImpl.getAutobotsFullName() + " and model is --> " + robotImpl.getAutobotsModelNumber();
        return df.syncedModel;
    }

}
