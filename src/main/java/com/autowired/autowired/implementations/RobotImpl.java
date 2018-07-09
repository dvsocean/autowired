package com.autowired.autowired.implementations;

import com.autowired.autowired.services.AutobotService;
import org.springframework.stereotype.Component;

@Component
public class RobotImpl implements AutobotService {

    private String name = "Tchiakowski Piana Robot";
    private int model;

    public void setModel(int model) {
        this.model = model;
    }

    public int getModel() {
        return model;
    }

    @Override
    public String getAutobotsFullName() {
        return name;
    }

    @Override
    public int getAutobotsModelNumber() {
        return model;
    }
}
