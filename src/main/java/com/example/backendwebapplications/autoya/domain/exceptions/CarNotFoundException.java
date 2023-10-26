package com.example.backendwebapplications.autoya.domain.exceptions;

public class CarNotFoundException extends RuntimeException {
    public CarNotFoundException(Long aLong){
        super("Car wih specification " + aLong + " not found");
    }
}