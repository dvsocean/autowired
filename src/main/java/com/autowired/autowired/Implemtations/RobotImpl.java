package com.autowired.autowired.Implemtations;

import com.autowired.autowired.services.AutobotService;

public class RobotImpl implements AutobotService {

    private String name = "Tchiakowski Piana Robot";
    private int model = 66745362;


    @Override
    public String getAutobotsFullName() {
        return name;
    }

    @Override
    public int getAutobotsModelNumber() {
        return model;
    }
}
