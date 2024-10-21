package com.fadel.example.math_service.ui;

import com.fadel.example.math_service.client.MathService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MathServiceCLI implements CommandLineRunner {
    // Autowired MathService proxy to consume the web service
    @Autowired
    private MathService mathService;
    @Override
    public void run(String... args) throws Exception {
// Demonstrating basic math operations using the MathService
        System.out.println("1 + 1 = " + mathService.add(1, 1));
        System.out.println("4 - 2 = " + mathService.subtract(4, 2));
        System.out.println("12 x 3 = " + mathService.multiply(12, 3));
        System.out.println("12 / 4 = " + mathService.divide(12, 4));
// Handling division by zero
        try {
            System.out.println("12 / 4 = " + mathService.divide(12, 0));
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
