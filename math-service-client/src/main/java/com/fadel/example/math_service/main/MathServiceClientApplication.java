package com.fadel.example.math_service.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {
        "com.fadel.example.math_service.client", // Scanner le package du client
        "com.fadel.example.math_service.config", // Scanner le package de configuration
        "com.fadel.example.math_service.ui", // Scanner le package de l'interface utilisateur
})
public class MathServiceClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(MathServiceClientApplication.class, args);
    }

}