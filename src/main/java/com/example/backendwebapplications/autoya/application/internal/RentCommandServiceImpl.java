package com.example.backendwebapplications.autoya.application.internal;

import com.example.backendwebapplications.autoya.domain.model.commands.CancelRentCommand;
import com.example.backendwebapplications.autoya.domain.model.commands.ConfirmRentCommand;
import com.example.backendwebapplications.autoya.domain.services.RentCommandService;
import com.example.backendwebapplications.autoya.infraestructure.persistence.jpa.repositories.OwnerRepository;
import com.example.backendwebapplications.autoya.infraestructure.persistence.jpa.repositories.TenantRepository;
import com.example.backendwebapplications.autoya.infraestructure.persistence.jpa.repositories.VehiculeRepository;

public class RentCommandServiceImpl implements RentCommandService {

    private final OwnerRepository ownerRepository;
    private final TenantRepository tenantRepository;
    private final VehiculeRepository vehicleRepository;

    public RentCommandServiceImpl(OwnerRepository ownerRepository, TenantRepository tenantRepository, VehiculeRepository vehicleRepository) {
        this.ownerRepository = ownerRepository;
        this.tenantRepository = tenantRepository;
        this.vehicleRepository = vehicleRepository;
    }

    @Override
    public Long handle(CancelRentCommand command) {
        return null;
    }

    @Override
    public Long handle(ConfirmRentCommand command) {
        return null;
    }
}
