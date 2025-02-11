package com.project.adoptpet.repository;

import com.project.adoptpet.model.Pets;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PetRepo extends JpaRepository<Pets, Integer> {
}
