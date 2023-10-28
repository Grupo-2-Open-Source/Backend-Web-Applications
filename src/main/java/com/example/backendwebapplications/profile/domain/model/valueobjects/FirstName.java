package com.example.backendwebapplications.profile.domain.model.valueobjects;

import jakarta.persistence.Embeddable;

@Embeddable
public record FirstName(
        String firstName){ // record debe tener el mimo nombre de atributo en este caso en el RegisterRequest
    public FirstName(){
        this(null);

    }
    public FirstName{
        if (firstName == null){
            throw new IllegalArgumentException("fistname Date cannot be null");
        }
    }
}