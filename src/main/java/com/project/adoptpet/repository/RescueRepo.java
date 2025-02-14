package com.project.adoptpet.repository;

import com.project.adoptpet.model.Rescue_reports;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RescueRepo extends JpaRepository<Rescue_reports, Integer> {
}
