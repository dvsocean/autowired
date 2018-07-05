package com.autowired.autowired.implementations;

import com.autowired.autowired.services.AutobotService;
import org.springframework.stereotype.Component;

@Component
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
