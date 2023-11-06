package com.example.backendwebapplications.autoya.application.internal.queryservices;

import com.example.backendwebapplications.autoya.domain.model.entities.Tenant;
import com.example.backendwebapplications.autoya.domain.model.queries.GetTenantByFullNameQuery;
import com.example.backendwebapplications.autoya.domain.services.TenantQueryService;
import com.example.backendwebapplications.autoya.infraestructure.persistence.jpa.repositories.TenantRepository;

import java.util.Optional;

public class TenantQueryServiceImpl implements TenantQueryService {
    private final TenantRepository tenantRepository;

    public TenantQueryServiceImpl(TenantRepository tenantRepository) {
        this.tenantRepository = tenantRepository;
    }

    /**
     * Query handle to get tenant by its full name
     * @param query containing tenant's first and lastname
     * @return Tenant
     */
    @Override
    public Optional<Tenant> handle(GetTenantByFullNameQuery query) {
        return tenantRepository.findByFullName(query.firstName(), query.lastName());
    }
}
