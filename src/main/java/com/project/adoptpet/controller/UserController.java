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
    public List<Users> getAllUsers(@RequestParam(required = false) String name,
                                   @RequestParam(required = false) String role,
                                   @RequestParam(required = false) Integer id) {
        if (name != null)
        {
            return repo.findByName(name);
        }
        else if (role != null)
        {
            return repo.findByRole(role);
        }
        else if (id != null)
        {
            return repo.findById(id).map(List::of).orElse(null);
        }
        return repo.findAll();
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
