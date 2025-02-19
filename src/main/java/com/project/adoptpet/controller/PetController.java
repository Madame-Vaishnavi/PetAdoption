package com.project.adoptpet.controller;

import com.project.adoptpet.model.Pets;
import com.project.adoptpet.repository.PetRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class PetController {

    @Autowired
    private PetRepo petRepository;

    @GetMapping("/pets")
    public String getAllPets(@RequestParam(required = false) String name,
                             @RequestParam(required = false) String breed,
                             @RequestParam(required = false) String type,
                             @RequestParam(required = false) String status,
                             Model model) {

        name = (name != null && name.isEmpty()) ? null : name;
        breed = (breed != null && breed.isEmpty()) ? null : breed;
        type = (type != null && type.isEmpty()) ? null : type;
        status = (status != null && status.isEmpty()) ? null : status;

        List<Pets> pets = petRepository.searchPets(name, breed, type, status);

        model.addAttribute("pets", pets);
        return "pets";
    }

    @GetMapping("/addPet")
    public String showAddPetPage(Model model) {
        model.addAttribute("pet", new Pets());
        return "add_pets"; // This will map to add_pet.jsp
    }

    @PostMapping("/addPet")
    public String addPet(@ModelAttribute Pets pet) {
        petRepository.save(pet);
        return "redirect:/pets";
    }


    @GetMapping("/deletePet/{id}")
    public String deletePetById(@PathVariable("id") int id) {
        petRepository.deleteById(id);
        return "redirect:/pets";
    }
}