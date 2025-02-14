package com.project.adoptpet.controller;


import com.project.adoptpet.model.Rescue_reports;
import com.project.adoptpet.repository.RescueRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RescueController {

    @Autowired
    RescueRepo repo;

    @GetMapping("/requests")
    public List<Rescue_reports> getAllRequests() {
        return repo.findAll();
    }

    @PostMapping("/addRequest")
    public void addRequest(@RequestBody Rescue_reports req) {
        repo.save(req);
    }

    @GetMapping("/requests/{id}")
    public Rescue_reports getRequest(@PathVariable int id) {
        return repo.findById(id).orElse(null);
    }

    @DeleteMapping("/requests/del/{id}")
    public void deleteRequest(@PathVariable int id) {
        repo.deleteById(id);
    }
}
