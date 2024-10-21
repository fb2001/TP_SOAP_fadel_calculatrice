package com.fadel.example.math_service.publisher;

import com.fadel.example.math_service.service.MathService;
import com.fadel.example.math_service.service.MathServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.xml.ws.Endpoint;

@Configuration
public class MathServicePublisher implements CommandLineRunner {// classe serveur

    private static final String SERVICE_URI = "http://localhost:8080/mathservice";

    @Autowired
    MathService mathService;



    @Override
    public void run(String... args) throws Exception {


        Endpoint.publish(SERVICE_URI, mathService);
        System.err.println("Web Service successfully published at: " +
                SERVICE_URI);
        System.err.println("Server ready!");

    }

}
