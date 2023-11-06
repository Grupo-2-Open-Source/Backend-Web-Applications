package com.example.backendwebapplications.autoya.domain.model.queries;

public record GetVehicleByAllPropertiesQuery(String location, Integer precio, String rentTime,
                                             String brand, String model, String carClass,
                                             String transmission){
}
