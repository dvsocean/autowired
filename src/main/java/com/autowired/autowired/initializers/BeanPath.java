package com.autowired.autowired.initializers;

import com.autowired.autowired.implementations.DroneImpl;
import com.autowired.autowired.implementations.RobotImpl;

public class BeanPath {


    DroneImpl drone;

    RobotImpl robot;

    public BeanPath(DroneImpl drone, RobotImpl robot){
        this.drone = drone;
        this.robot = robot;
    }

    public String produceRelevantNames(){
        String droneName = drone.getAutobotsFullName();
        String robotName = robot.getAutobotsFullName();
        return "Your bots name are: " + droneName + " and " + robotName;
    }


}
