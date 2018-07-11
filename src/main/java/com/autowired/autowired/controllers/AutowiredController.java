package com.autowired.autowired.controllers;

import com.autowired.autowired.feed.DataFeed;
import com.autowired.autowired.services.AutobotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AutowiredController {

    @Autowired
    AutobotService robotImpl;

    @Autowired
    DataFeed dataFeed;

    @GetMapping("/auto")
    public String findAccessName(){
       return dataFeed.getLockHeedMartinData() + " and " + dataFeed.getLocation();
    }

    @GetMapping("/bot")
    public String returnAutobot(){
        return robotImpl.getAutobotsFullName();
    }

}
