package com.example.backendwebapplications.autoya.domain.model.valueobjects;

import com.example.backendwebapplications.autoya.domain.model.entities.Vehicule;
import jakarta.persistence.Embeddable;
import jakarta.persistence.OneToMany;

import java.util.ArrayList;
import java.util.List;

@Embeddable
public class ListVehicules {

    @OneToMany(mappedBy = "vehicule")
    private  List<Vehicule> Vehicules;


    public ListVehicules() {
        this.Vehicules = new ArrayList<>();
    }

    public void addItem(Vehicule vehicule) {
//        Vehicule vehicule1 = new Vehicule();
        Vehicules.add(vehicule);
    }
}
