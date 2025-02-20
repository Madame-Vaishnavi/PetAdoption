package com.project.adoptpet.model;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.sql.Date;
import java.sql.Timestamp;
import java.time.Instant;

@Entity
@Setter
@Getter
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String password;
    private String email;
    private String phone;
    private String role;
    private String location;
    @Column(nullable = false, updatable = false)
    private Timestamp created_at;

    @PrePersist
    protected void onCreate() {
        created_at = Timestamp.from(Instant.now());
    }
}
