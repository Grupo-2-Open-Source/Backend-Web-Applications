package com.example.backendwebapplications.autoya.application.internal.queryservices;

import com.example.backendwebapplications.autoya.domain.model.entities.Owner;
import com.example.backendwebapplications.autoya.domain.model.queries.GetOwnerByFullNameQuery;
import com.example.backendwebapplications.autoya.domain.services.OwnerQueryService;
import com.example.backendwebapplications.autoya.infraestructure.persistence.jpa.repositories.OwnerRepository;

import java.util.Optional;

public class OwnerQueryServiceImpl implements OwnerQueryService {
    private final OwnerRepository ownerRepository;

    public OwnerQueryServiceImpl(OwnerRepository ownerRepository) {
        this.ownerRepository = ownerRepository;
    }

    /**
     * Query handle to get owner by its full name
     * @param query containing owner's first and lastname
     * @return Owner
     */
    @Override
    public Optional<Owner> handle(GetOwnerByFullNameQuery query) {
        return ownerRepository.findByFullName(query.firstName(), query.lastName());
    }
}
