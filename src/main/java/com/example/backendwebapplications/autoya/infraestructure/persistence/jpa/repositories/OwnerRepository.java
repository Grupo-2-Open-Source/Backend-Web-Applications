package com.example.backendwebapplications.autoya.infraestructure.persistence.jpa.repositories;

import com.example.backendwebapplications.autoya.domain.model.entities.Owner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface OwnerRepository extends JpaRepository<Owner, Long>  {
    Optional<Owner> findById(Long ownerId);
    Optional<Owner> findByFullName(String firstName, String lastName);
}
