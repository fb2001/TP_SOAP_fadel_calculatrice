package com.fadel.example.math_service.config;

import com.fadel.example.math_service.service.MathService;
import com.fadel.example.math_service.service.MathServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MathServiceConfig {
    @Bean
    MathService mathService() {
        return new MathServiceImpl();
    }
}
