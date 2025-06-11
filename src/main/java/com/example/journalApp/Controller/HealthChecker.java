package com.example.journalApp.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthChecker {
    @GetMapping("/health-check")
    public String healthCheck(){
        return "Ok";
    }
}
