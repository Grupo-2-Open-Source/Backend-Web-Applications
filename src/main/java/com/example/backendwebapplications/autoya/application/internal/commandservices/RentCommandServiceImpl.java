package com.example.backendwebapplications.autoya.application.internal.commandservices;

import com.example.backendwebapplications.autoya.domain.model.commands.CancelRentCommand;
import com.example.backendwebapplications.autoya.domain.model.commands.ConfirmRentCommand;
import com.example.backendwebapplications.autoya.domain.model.entities.Vehicle;
import com.example.backendwebapplications.autoya.domain.services.RentCommandService;
import com.example.backendwebapplications.autoya.infraestructure.persistence.jpa.repositories.OwnerRepository;
import com.example.backendwebapplications.autoya.infraestructure.persistence.jpa.repositories.RentRepository;
import com.example.backendwebapplications.autoya.infraestructure.persistence.jpa.repositories.TenantRepository;
import com.example.backendwebapplications.autoya.infraestructure.persistence.jpa.repositories.VehicleRepository;

import java.util.Optional;

public class RentCommandServiceImpl implements RentCommandService {

    /*private final OwnerRepository ownerRepository;
    private final TenantRepository tenantRepository;*/
    private final VehicleRepository vehicleRepository;
    private final RentRepository rentRepository;

    public RentCommandServiceImpl(VehicleRepository vehicleRepository, RentRepository rentRepository) {
        /*this.ownerRepository = ownerRepository;
        this.tenantRepository = tenantRepository;*/
        this.vehicleRepository = vehicleRepository;
        this.rentRepository = rentRepository;
    }

    @Override
    public Long handle(CancelRentCommand command, Long vehicleId) {

        Optional<Vehicle> optionalVehicule = vehicleRepository.findById(vehicleId);

        if (optionalVehicule.isPresent()) {
            rentRepository.findById(command.rentId()).map(rent -> {
                rent.cancel();
                rent.getVehicule().setRented(false);
                rentRepository.save(rent);
                return rent.getId();
            }).orElseThrow(() -> new RuntimeException("Rent not found"));
        }
        else {
            throw new RuntimeException("Vehicle not found");
        }

        return null;
    }

    @Override
    public Long handle(ConfirmRentCommand command, Long vehicleId) {

        Optional<Vehicle> optionalVehicule = vehicleRepository.findById(vehicleId);

        if (optionalVehicule.isPresent()) {
            rentRepository.findById(command.rentId()).map(rent -> {
                rent.confirm();
                rent.getVehicule().setRented(true);
                rent.getTenant().addVehicle(rent.getVehicule());
                rentRepository.save(rent);
                return rent.getId();
            }).orElseThrow(() -> new RuntimeException("Rent not found"));
        }
        else {
            throw new RuntimeException("Vehicle not found");
        }

        return null;
    }
}
