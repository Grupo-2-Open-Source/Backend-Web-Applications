package com.example.backendwebapplications.profile.domain.model.valueobjects;

import jakarta.persistence.Embeddable;

@Embeddable
public record LastName(
        String lastName){
    public LastName(){
        this(null);

    }
    public LastName{
        if (lastName == null){
            throw new IllegalArgumentException("lastname Date cannot be null");
        }
    }
}