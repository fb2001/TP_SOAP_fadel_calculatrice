package com.fadel.example.math_service.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


//wsimport -keep -p "com.fadel.example.math_service.client" "http://localhost:8080/mathservice"



// Classe principale pour démarrer l'application Spring Boot
@SpringBootApplication(scanBasePackages = {
		"com.fadel.example.math_service.service",// Scanner le package du service
		"com.fadel.example.math_service.config", // a fin de relier Publisher avec Mathservice (Bean)
		"com.fadel.example.math_service.publisher" // Scanner le package de publication
})
public class Application {
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args); // Démarrage del'application
	}
}