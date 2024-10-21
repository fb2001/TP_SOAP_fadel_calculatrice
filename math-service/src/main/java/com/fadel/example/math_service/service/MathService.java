package com.fadel.example.math_service.service;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface MathService {
    @WebMethod
    public int add(int a, int b);

    @WebMethod
    public int subtract(int a, int b);

    @WebMethod
    public int multiply(int a, int b);

    @WebMethod
    public int divide(int a, int b)throws IllegalArgumentException;
}