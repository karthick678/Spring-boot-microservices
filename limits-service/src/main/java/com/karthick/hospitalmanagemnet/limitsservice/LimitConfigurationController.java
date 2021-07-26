package com.karthick.hospitalmanagemnet.limitsservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitConfigurationController {

    @Autowired
    private Configuration configuration;

    @GetMapping("/limits")
    public LimitConfiguration retriveLimitsFromConfigurations() {
        return  new LimitConfiguration(configuration.getMinimum(), configuration.getMaximum());
    }
}
