package com.example.backendwebapplications.users.domain.model.aggregates.Auth;

import com.example.backendwebapplications.users.domain.model.aggregates.User.Role;
import com.example.backendwebapplications.profile.domain.model.valueobjects.*;
import jakarta.persistence.Embedded;
import lombok.*;

@Data
@Builder

@AllArgsConstructor
@NoArgsConstructor
public class RegisterRequest {

    String username;
    String password;


    @Embedded
    public BirthDate birthDate;
//    Long phonenumber;

    @Embedded
    public PhoneNumber phoneNumber;
    @Embedded
    public FirstName firstName;
    @Embedded
    public LastName lastName;

    String country;

    Role role;
}
