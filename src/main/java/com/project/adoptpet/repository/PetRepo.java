package com.project.adoptpet.repository;

import com.project.adoptpet.model.Pets;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PetRepo extends JpaRepository<Pets, Integer> {
    public List<Pets> findByName(String name);
    public List<Pets> findByBreed(String breed);
    public List<Pets> findByType(String type);
}
