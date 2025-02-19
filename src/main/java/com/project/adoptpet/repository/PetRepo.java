package com.project.adoptpet.repository;

import com.project.adoptpet.model.Pets;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PetRepo extends JpaRepository<Pets, Integer> {
    @Query("SELECT p FROM Pets p WHERE " +
            "(:name IS NULL OR p.name LIKE %:name%) AND " +
            "(:breed IS NULL OR p.breed LIKE %:breed%) AND " +
            "(:type IS NULL OR p.type LIKE %:type%) AND " +
            "(:status IS NULL OR p.status LIKE %:status%)")
    List<Pets> searchPets(@Param("name") String name, @Param("breed") String breed,
                          @Param("type") String type, @Param("status") String status);
}
