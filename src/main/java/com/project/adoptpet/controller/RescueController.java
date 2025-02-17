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

    @GetMapping("/reports")
    public List<Rescue_reports> getAllReports(@RequestParam(required = false) Integer id,
                                              @RequestParam(required = false) String status) {
        if(id != null) {
            return repo.findById(id).map(List::of).orElse(null);
        }
        else if(status != null) {
            return repo.findByStatus(status);
        }
        return repo.findAll();
    }

    @PostMapping("/addReport")
    public void addReport(@RequestBody Rescue_reports req) {
        repo.save(req);
    }

   @DeleteMapping("/delReports/{id}")
    public void deleteReport(@PathVariable int id) {
        repo.deleteById(id);
    }
}
