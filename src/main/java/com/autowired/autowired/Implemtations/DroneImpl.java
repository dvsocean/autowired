package com.autowired.autowired.Implemtations;

import com.autowired.autowired.services.AutobotService;

public class DroneImpl implements AutobotService {

    private String name = "The Honda Robot";
    private int model = 766293;


    @Override
    public String getAutobotsFullName() {
        return name;
    }

    @Override
    public int getAutobotsModelNumber() {
        return model;
    }
}
