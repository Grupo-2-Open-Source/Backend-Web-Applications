package com.example.backendwebapplications.profile.domain.model.valueobjects;

import jakarta.persistence.Embeddable;
import jakarta.validation.constraints.Email;

@Embeddable
public record EmailAddress(
 @Email
 String address){
 public EmailAddress(){
        this(null);
 }
    public EmailAddress{
        if (address == null || address.isBlank()){
            throw new IllegalArgumentException("Address cannot be null or blank");
        }
    }

}