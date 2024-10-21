package com.fadel.example.math_service.service;
import javax.jws.WebMethod;
import javax.jws.WebService;


@WebService(endpointInterface = "com.fadel.example.math_service.service.MathService") // toujours bien specifier le chemin complet de l'interface
public class MathServiceImpl implements MathService {
    @WebMethod
    @Override
    public int add(int a, int b) {
        return a + b;
    }

    @WebMethod
    @Override
    public int subtract(int a, int b) {
        return a - b;
    }

    @WebMethod
    @Override
    public int multiply(int a, int b) {
        return a * b;
    }

    @WebMethod
    @Override
    public int divide(int a, int b) throws IllegalArgumentException {
        if (b == 0) {
            throw new IllegalArgumentException("Division by zero");
        }
        return a / b;
    }
}
