package com.example.backendwebapplications.autoya.domain.services;

import com.example.backendwebapplications.autoya.domain.model.aggregates.Rent;
import com.example.backendwebapplications.autoya.domain.model.queries.GetAllRentsByOwnerIdQuery;
import com.example.backendwebapplications.autoya.domain.model.queries.GetAllRentsByTenantIdQuery;

import java.util.List;

public interface RentQueryService {
    List<Rent> handle(GetAllRentsByOwnerIdQuery query);
    List<Rent> handle(GetAllRentsByTenantIdQuery query);
}
