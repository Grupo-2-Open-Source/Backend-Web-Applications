package com.example.backendwebapplications.autoya.domain.model.aggregates;

import com.example.backendwebapplications.autoya.domain.model.valueobjects.CarClass;
import com.example.backendwebapplications.autoya.domain.model.valueobjects.CarTransmission;
import com.example.backendwebapplications.autoya.domain.model.valueobjects.ListVehicules;
import com.example.backendwebapplications.shared.domain.model.entities.AuditableModel;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Vehicule extends AuditableModel {

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
    @Embedded
    private ListVehicules listVehicules;

}
