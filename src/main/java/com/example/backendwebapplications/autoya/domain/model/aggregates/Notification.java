package com.example.backendwebapplications.autoya.domain.model.aggregates;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Notification {
    @Id
    private Long id;
    private String body;

//    @ManyToOne
//    @JoinColumn(name = "user_id")
//    private User user;

}
