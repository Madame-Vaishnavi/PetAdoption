package com.project.adoptpet.repository;


import com.project.adoptpet.model.Adoption_requests;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AdoptRepo extends JpaRepository<Adoption_requests,Integer> {
    List<Adoption_requests> findByPetId(int petId);
    List<Adoption_requests> findByStatus(String status);
    List<Adoption_requests> findByUserId(int userId);

}
