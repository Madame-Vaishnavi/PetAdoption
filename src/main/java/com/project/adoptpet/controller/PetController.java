package com.project.adoptpet.controller;

import com.project.adoptpet.model.Pets;
import com.project.adoptpet.repository.PetRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PetController {

    @Autowired
    PetRepo petrepo;

    @GetMapping("/pets")
    public List<Pets> getAllPets() {
        return petrepo.findAll();
    }

    @GetMapping("pet/{id}")
    public Pets getPetById(@PathVariable("id") int id) {
        return petrepo.findById(id).orElse(null);
    }
}
