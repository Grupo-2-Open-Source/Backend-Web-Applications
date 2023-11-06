package com.example.backendwebapplications.autoya.domain.services;

import com.example.backendwebapplications.autoya.domain.model.entities.Vehicle;
import com.example.backendwebapplications.autoya.domain.model.queries.GetVehicleByAllPropertiesQuery;

import java.util.Optional;

public interface VehicleQueryService {
    Optional<Vehicle> handle(GetVehicleByAllPropertiesQuery query);
}
