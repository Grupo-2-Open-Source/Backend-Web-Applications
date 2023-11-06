package com.example.backendwebapplications.autoya.infraestructure.persistence.jpa.repositories;

import com.example.backendwebapplications.autoya.domain.model.entities.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface VehicleRepository extends JpaRepository<Vehicle, Long> {
    Optional<Vehicle> findByAllProperties(String location, Integer precio, String rentTime,
                                          String brand, String model, String carClass,
                                          String transmission);
}
