package com.example.springsecurityjwtdemo.repository;

import com.example.springsecurityjwtdemo.models.ERole;
import com.example.springsecurityjwtdemo.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(ERole name);
}
