package com.example.demo.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheck {

    private static final Logger log = LogManager.getLogger(HealthCheck.class);

    @GetMapping("HealthCheck")
    public String healthCheck() {
        log.info("HealthCheck: [Alive]");
        return "I am alive!";
    }
}
