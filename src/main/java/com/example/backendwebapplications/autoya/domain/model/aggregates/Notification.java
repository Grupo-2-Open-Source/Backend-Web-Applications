package com.example.backendwebapplications.autoya.domain.model.aggregates;

import com.example.backendwebapplications.autoya.domain.model.entities.Owner;
import com.example.backendwebapplications.autoya.domain.model.entities.Tenant;
import jakarta.persistence.*;
import org.springframework.data.domain.AbstractAggregateRoot;

@Entity
public class Notification extends AbstractAggregateRoot<Notification>  {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long id;

    private String tenantName;

    private String brand;

    private String model;

    @ManyToOne
    @JoinColumn(name="owner_Id")
    private Owner owner;

}
