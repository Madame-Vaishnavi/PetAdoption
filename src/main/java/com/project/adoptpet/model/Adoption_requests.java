package com.project.adoptpet.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;

@Entity
@Getter
@Setter
public class Adoption_requests {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name="pet_id")
    private int petId;
    @Column(name="user_id")
    private int userId;
    private String status;
    private Timestamp request_date;
}
