package com.example.backendwebapplications.autoya.LoginRegister.Auth;

import com.example.backendwebapplications.autoya.LoginRegister.User.Role;
import com.example.backendwebapplications.profile.domain.model.valueobjects.*;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import lombok.*;

import java.util.Date;

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
