package com.example.backendwebapplications.autoya.domain.model.entities;

import com.example.backendwebapplications.autoya.domain.model.valueobjects.CarClass;
import com.example.backendwebapplications.autoya.domain.model.valueobjects.CarTransmission;
import com.example.backendwebapplications.shared.domain.model.entities.AuditableModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Vehicle extends AuditableModel {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long id;

    private  String brand; //marca

    private String model; //modelo

    private Integer max_velicity;

    private Integer fuelconsumption;

    private String dimensions;

    private Integer weight;

    private CarClass carClass;

    private CarTransmission carTransmission;

    private String location;

    private Integer price;

    private String rentTime;

    private Boolean rented;

}
