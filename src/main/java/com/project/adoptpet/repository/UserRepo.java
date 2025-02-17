package com.project.adoptpet.repository;

import com.project.adoptpet.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepo extends JpaRepository<Users, Integer> {
    public List<Users> findByName(String name);
    public List<Users> findByRole(String role);
}
