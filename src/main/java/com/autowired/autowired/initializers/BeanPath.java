package com.autowired.autowired.initializers;

import com.autowired.autowired.implementations.DroneImpl;
import com.autowired.autowired.implementations.RobotImpl;

public class BeanPath {


    DroneImpl droneImpl;

    RobotImpl robot;

    public BeanPath(DroneImpl droneImpl, RobotImpl robot){
        this.droneImpl = droneImpl;
        this.robot = robot;
    }

    public String produceRelevantNames(){
        String droneName = droneImpl.getAutobotsFullName();
        String robotName = robot.getAutobotsFullName();
        return "Your bots name are: " + droneName + " and " + robotName;
    }


}
