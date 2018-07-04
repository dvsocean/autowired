package com.autowired.autowired.controllers;

import com.autowired.autowired.Implemtations.DroneImpl;
import com.autowired.autowired.Implemtations.RobotImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AutowiredController {

    DroneImpl drone;
    RobotImpl robot;

    @GetMapping("/auto")
    public String findAccessName(){
        String accessDroneName = drone.getAutobotsFullName();
        String accessRobotName = robot.getAutobotsFullName();
        return "These two names are " + accessDroneName + " and " + accessRobotName;
    }

}
