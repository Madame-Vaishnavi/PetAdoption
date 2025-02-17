package com.project.adoptpet.controller;

import com.project.adoptpet.model.Pets;
import com.project.adoptpet.repository.PetRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PetController {

    @Autowired
    PetRepo petrepo;

    @GetMapping("/pets")
    public List<Pets> getAllPets(@RequestParam(required = false) String name,
                                 @RequestParam(required = false) String type,
                                 @RequestParam(required = false) String breed,
                                 @RequestParam(required = false) String status) {
        if(name != null)
        {
            return petrepo.findByName(name);
        }
        else if(type != null)
        {
            return petrepo.findByType(type);
        }
        else if(breed != null)
        {
            return petrepo.findByBreed(breed);
        }
        else if(status != null)
        {
            return petrepo.findByStatus(status);
        }
        return petrepo.findAll();
    }
    @PostMapping("/addPet")
    public void addPet(@RequestBody Pets pet) {
        petrepo.save(pet);
    }

    @DeleteMapping("pets/{id}")
    public void deletePetById(@PathVariable("id") int id) {
        petrepo.deleteById(id);
    }
}
