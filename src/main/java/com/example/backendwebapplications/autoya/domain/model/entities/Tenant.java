package com.example.backendwebapplications.autoya.domain.model.entities;

import com.example.backendwebapplications.profile.domain.model.valueobjects.BirthDate;
import com.example.backendwebapplications.profile.domain.model.valueobjects.FirstName;
import com.example.backendwebapplications.profile.domain.model.valueobjects.LastName;
import com.example.backendwebapplications.profile.domain.model.valueobjects.PhoneNumber;
import jakarta.persistence.*;
import lombok.Getter;

import java.util.List;

@Entity
@Getter
public class Tenant {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    Integer id;

    @Column(nullable = false)
    String username;

    @Column(nullable = false)
    String password;

    @Embedded
    private LastName lastName;

    @Embedded
    private FirstName firstName;

    @Embedded
    private BirthDate birthDate;

    @Embedded
    private PhoneNumber phoneNumber;

    private String antecedentesPenales;

    @OneToMany
    @JoinColumn(name="vehicule_id")
    private List<Vehicle> rentedVehicles;
}
