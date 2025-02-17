package com.project.adoptpet.controller;

import com.project.adoptpet.model.Adoption_requests;
import com.project.adoptpet.repository.AdoptRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AdoptController {

    @Autowired
    AdoptRepo repo;

    @GetMapping("/requests")
    public List<Adoption_requests> getAllRequests(@RequestParam(required = false) String status,
                                                  @RequestParam(required = false) Integer petId,
                                                  @RequestParam(required = false) Integer userId,
                                                  @RequestParam(required = false) Integer id)
    {
        if(status!= null)
        {
            return repo.findByStatus(status);
        }
        else if (petId!= null) {
            return repo.findByPetId(petId);
        }
        else if (userId!= null) {
            return repo.findByUserId(userId);
        }
        else if (id!= null) {
            return repo.findById(id).map(List::of).orElse(null);
        }
        return repo.findAll();
    }



}
