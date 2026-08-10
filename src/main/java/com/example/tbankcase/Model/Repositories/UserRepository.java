package com.example.tbankcase.Model.Repositories;

import com.example.tbankcase.Model.entities.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Users, Long> {
}
