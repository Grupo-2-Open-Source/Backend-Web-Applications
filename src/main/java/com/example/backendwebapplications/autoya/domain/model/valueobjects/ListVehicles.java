package com.example.backendwebapplications.autoya.domain.model.valueobjects;

import com.example.backendwebapplications.autoya.domain.model.entities.Vehicle;
import jakarta.persistence.Embeddable;
import jakarta.persistence.OneToMany;

import java.util.ArrayList;
import java.util.List;

@Embeddable
public class ListVehicles {

    @OneToMany(mappedBy = "vehicule")
    private  List<Vehicle> Vehicules;


    public ListVehicles() {
        this.Vehicules = new ArrayList<>();
    }

    public void addItem(Vehicle vehicule) {
//        Vehicule vehicule1 = new Vehicule();
        Vehicules.add(vehicule);
    }
}
