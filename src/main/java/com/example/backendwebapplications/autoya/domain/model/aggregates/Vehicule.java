package com.example.backendwebapplications.autoya.domain.model.aggregates;

import com.example.backendwebapplications.autoya.domain.model.valueobjects.CarClass;
import com.example.backendwebapplications.autoya.domain.model.valueobjects.CarTransmission;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;

@Getter
@Entity
public class Vehicule {

    @Id
    private Long id;

    private  String brand; //marca

    private String model; //modelo

    private Integer max_velicity;

    private Integer fuelconsumption;

    private String dimensions;

    private Integer weight;

    private CarClass carClass;

    private CarTransmission carTransmission;
}