package com.example.backendwebapplications.autoya.infraestructure.persistence.jpa.repositories;

import com.example.backendwebapplications.autoya.domain.model.entities.Tenant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TenantRepository extends JpaRepository<Tenant, Long> {
    Optional<Tenant> findById(Long tenantId);
    Optional<Tenant> findByFullName(String firstName, String lastName);
}
