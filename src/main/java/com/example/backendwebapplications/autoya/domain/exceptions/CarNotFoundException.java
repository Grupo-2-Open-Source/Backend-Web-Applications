package com.example.backendwebapplications.autoya.domain.exceptions;

public class CarNotFoundException extends RuntimeException {
    public CarNotFoundException(Long vehicleId){
        super("Car wih specification " + vehicleId + " not found");
    }
}