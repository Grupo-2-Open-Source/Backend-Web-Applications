package com.example.backendwebapplications.autoya.infraestructure.persistence.jpa.repositories;

import com.example.backendwebapplications.autoya.domain.model.aggregates.Rent;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RentRepository extends JpaRepository<Rent, Long> {
    List<Rent> findAllByTenantId(Long tenantId);
    List<Rent> findAllByOwnerId(Long ownerId); //COMPLETAR IMPLEMENTACIÓN DE SERVICES
}
