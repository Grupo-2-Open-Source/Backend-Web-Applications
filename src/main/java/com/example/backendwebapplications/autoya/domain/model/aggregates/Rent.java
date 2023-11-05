package com.example.backendwebapplications.autoya.domain.model.aggregates;

import com.example.backendwebapplications.autoya.domain.model.entities.Owner;
import com.example.backendwebapplications.autoya.domain.model.entities.Tenant;
import com.example.backendwebapplications.autoya.domain.model.entities.Vehicule;
import jakarta.persistence.*;
import org.springframework.data.domain.AbstractAggregateRoot;

@Entity
public class Rent extends AbstractAggregateRoot<Rent>  { //process
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long Id;

    private String rentContract;

    @ManyToOne
    @JoinColumn(name ="owner_id")
    private Owner owner;

    @ManyToOne
    @JoinColumn(name="tenant_Id")
    private Tenant tenant;

    @OneToOne
    @JoinColumn(name="vehicule_Id")
    private Vehicule vehicule;
}
