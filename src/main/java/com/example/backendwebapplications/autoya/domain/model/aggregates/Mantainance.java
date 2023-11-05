package com.example.backendwebapplications.autoya.domain.model.aggregates;

import com.example.backendwebapplications.autoya.domain.model.entities.Owner;
import com.example.backendwebapplications.autoya.domain.model.entities.Tenant;
import jakarta.persistence.*;
import lombok.Getter;
import org.springframework.data.domain.AbstractAggregateRoot;

@Entity
@Getter
public class Mantainance extends AbstractAggregateRoot<Mantainance> {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long Id;

    @ManyToOne
    @JoinColumn(name="owner_Id")
    private Owner owner;

    @ManyToOne
    @JoinColumn(name="tenant_Id")
    private Tenant tenant;

    private String problemType;

    private String description;

    private String image;
}
