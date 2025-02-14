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
    public List<Pets> getAllPets() {
        return petrepo.findAll();
    }

    @GetMapping("petByName/{name}")
    public List<Pets> getPetByName(@PathVariable("name") String name) {
        return petrepo.findByName(name);
    }

    @GetMapping("petByBreed/{breed}")
    public List<Pets> getPetByBreed(@PathVariable("breed") String breed) {
        return petrepo.findByBreed(breed);
    }

    @GetMapping("petByType/{type}")
    public List<Pets> getPetByType(@PathVariable("type") String type) {
        return petrepo.findByType(type);
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
