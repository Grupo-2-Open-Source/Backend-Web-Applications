package com.example.backendwebapplications.autoya.application.internal.queryservices;

import com.example.backendwebapplications.autoya.domain.model.entities.Vehicle;
import com.example.backendwebapplications.autoya.domain.model.queries.GetVehicleByAllPropertiesQuery;
import com.example.backendwebapplications.autoya.domain.services.VehicleQueryService;
import com.example.backendwebapplications.autoya.infraestructure.persistence.jpa.repositories.VehicleRepository;

import java.util.Optional;

public class VehicleQueryServiceImpl implements VehicleQueryService {
    private final VehicleRepository vehicleRepository;

    public VehicleQueryServiceImpl(VehicleRepository vehicleRepository) {
        this.vehicleRepository = vehicleRepository;
    }

    /**
     * Query handle to get vehicle by some properties
     * @param query containing required vehicle properties
     * @return Vehicle
     */
    @Override
    public Optional<Vehicle> handle(GetVehicleByAllPropertiesQuery query) {
        return vehicleRepository.findByAllProperties(query.location(), query.precio(),
                                                     query.rentTime(), query.brand(), query.model(),
                                                     query.carClass(), query.transmission());
    }
}
