package com.project.adoptpet.controller;

import com.project.adoptpet.model.Users;
import com.project.adoptpet.repository.UserRepo;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserRepo repo;

    @GetMapping("/users")
    public List<Users> getAllUsers() {
        return repo.findAll();
    }

    @GetMapping("/users/{name}")
    public List<Users> getUserByName(@PathVariable("name") String name) {
        return repo.findByName(name);
    }

    @PostMapping("/addUser")
    public void addUser(Users user) {
        repo.save(user);
    }

    @DeleteMapping("users/{id}")
    public void deletePetById(@PathVariable("id") int id) {
        repo.deleteById(id);
    }

}
