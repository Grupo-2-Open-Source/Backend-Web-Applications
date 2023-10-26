package com.example.backendwebapplications.profile.domain.model.valueobjects;

import jakarta.persistence.Embeddable;
import jakarta.validation.constraints.Email;

@Embeddable
public record PhoneNumber(
 Long phoneNumber){
    public PhoneNumber(){
        this(null);

    }
    public PhoneNumber{
        if (phoneNumber == null ){
            throw new IllegalArgumentException("Phone Number cannot be null");
        }
    }
}