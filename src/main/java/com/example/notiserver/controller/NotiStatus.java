package com.example.notiserver.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class NotiStatus {
    @GetMapping("/isAlertActivate")
    public Boolean isAlertActivate() {
        return true;
    }
}