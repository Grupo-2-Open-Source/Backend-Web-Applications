package com.example.backendwebapplications.autoya.domain.services;

import com.example.backendwebapplications.autoya.domain.model.entities.Tenant;
import com.example.backendwebapplications.autoya.domain.model.queries.GetTenantByFullNameQuery;

import java.util.Optional;

public interface TenantQueryService {
    Optional<Tenant> handle(GetTenantByFullNameQuery query);
}
