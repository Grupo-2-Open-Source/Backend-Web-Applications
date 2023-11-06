package com.example.backendwebapplications.autoya.domain.services;

import com.example.backendwebapplications.autoya.domain.model.entities.Owner;
import com.example.backendwebapplications.autoya.domain.model.queries.GetOwnerByFullNameQuery;

import java.util.Optional;

public interface OwnerQueryService {
    Optional<Owner> handle(GetOwnerByFullNameQuery query);
}
