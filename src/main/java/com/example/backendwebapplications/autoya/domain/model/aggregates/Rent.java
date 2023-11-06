package com.example.backendwebapplications.autoya.domain.model.aggregates;

import com.example.backendwebapplications.autoya.domain.model.entities.Owner;
import com.example.backendwebapplications.autoya.domain.model.entities.Tenant;
import com.example.backendwebapplications.autoya.domain.model.entities.Vehicle;
import com.example.backendwebapplications.autoya.domain.model.valueobjects.RentStatus;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.domain.AbstractAggregateRoot;

@Entity
@Getter
@Setter
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
    private Vehicle vehicule;

    private RentStatus rentStatus;

    public Rent(){}

    public Rent(String rentContract, Owner owner, Tenant tenant, Vehicle vehicule) {
        this.rentContract = rentContract;
        this.owner = owner;
        this.tenant = tenant;
        this.vehicule = vehicule;
        this.rentStatus = RentStatus.WAITING;
    }

    public void cancel() {
        this.rentStatus = RentStatus.CANCELLED;
    }
    public void confirm() {
        this.rentStatus = RentStatus.CONFIRMED;
    }
}
