package com.project.adoptpet.model;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.sql.Date;
import java.sql.Timestamp;


@Entity
@Getter
@Setter
public class Pets {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String type;
    private String breed;
    private int age;
    private String health_status;
    private String image_url;
    private String status;
    private int center_id;
    private Timestamp created_at;
}
