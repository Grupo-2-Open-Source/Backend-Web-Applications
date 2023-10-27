package com.example.backendwebapplications.autoya.LoginRegister.Auth;

import com.example.backendwebapplications.autoya.LoginRegister.User.Role;
import com.example.backendwebapplications.profile.domain.model.valueobjects.PhoneNumber;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RegisterRequest {
    String username;
    String password;
    String firstname;
    Date date;

    @Embedded
    public PhoneNumber phoneNumber;
    String lastname;
    String country;

    Role role;
}
