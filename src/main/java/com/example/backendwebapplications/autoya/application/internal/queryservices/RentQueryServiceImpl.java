package com.example.backendwebapplications.autoya.application.internal.queryservices;

import com.example.backendwebapplications.autoya.domain.model.aggregates.Rent;
import com.example.backendwebapplications.autoya.domain.model.queries.GetAllRentsByOwnerIdQuery;
import com.example.backendwebapplications.autoya.domain.model.queries.GetAllRentsByTenantIdQuery;
import com.example.backendwebapplications.autoya.domain.services.RentQueryService;
import com.example.backendwebapplications.autoya.infraestructure.persistence.jpa.repositories.RentRepository;

import java.util.List;

public class RentQueryServiceImpl implements RentQueryService {
    private final RentRepository rentRepository;

    public RentQueryServiceImpl(RentRepository rentRepository) {
        this.rentRepository = rentRepository;
    }

    /**
     * Query handle to get rent list by its owner's id
     * @param query containing owner's id
     * @return Rent List
     */
    @Override
    public List<Rent> handle(GetAllRentsByOwnerIdQuery query) {
        return rentRepository.findAllByOwnerId(query.ownerId());
    }

    /**
     * Query handle to get rent list by its tenant's id
     * @param query containing tenant's id
     * @return Tenant List
     */
    @Override
    public List<Rent> handle(GetAllRentsByTenantIdQuery query) {
        return rentRepository.findAllByTenantId(query.tenantId());
    }
}
