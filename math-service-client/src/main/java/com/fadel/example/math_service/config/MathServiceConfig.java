package com.fadel.example.math_service.config;


import com.fadel.example.math_service.client.MathService;
import com.fadel.example.math_service.client.MathServiceImplService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.net.MalformedURLException;
import java.net.URL;

@Configuration
public class MathServiceConfig {
    // URL of the MathService WSDL
    private static final String SERVICE_URL = "http://localhost:8080/mathservice?wsdl";

    @Bean
    MathService mathServiceProxy() throws MalformedURLException {
        return new MathServiceImplService(new URL(SERVICE_URL))
                .getMathServiceImplPort();
    }
}