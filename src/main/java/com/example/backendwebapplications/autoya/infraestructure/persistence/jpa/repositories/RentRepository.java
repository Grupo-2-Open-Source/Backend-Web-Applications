package com.example.backendwebapplications.autoya.infraestructure.persistence.jpa.repositories;

import com.example.backendwebapplications.autoya.domain.model.aggregates.Rent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RentRepository extends JpaRepository<Rent, Long> {
    List<Rent> findAllByTenantId(Long tenantId);
    List<Rent> findAllByOwnerId(Long ownerId);
}
