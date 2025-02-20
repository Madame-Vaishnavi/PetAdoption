package com.project.adoptpet.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;
import java.time.Instant;

@Entity
@Getter
@Setter
public class Rescue_reports {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int user_id;
    private String location;
    private String description;
    private String image_url;
    private String status;
    @Column(nullable = false, updatable = false)
    private Timestamp report_at;

    @PrePersist
    protected void onCreate() {
        report_at = Timestamp.from(Instant.now());
    }
}
