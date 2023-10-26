package com.example.backendwebapplications.profile.domain.model.valueobjects;

import jakarta.persistence.Embeddable;

import java.util.Date;

@Embeddable
public record BirthDate(
 Date birthDate){
    public BirthDate(){
        this(null);

    }
    public BirthDate{
        if (birthDate == null){
            throw new IllegalArgumentException("Birth Date cannot be null");
        }
    }
}