package com.example.backendwebapplications.shared.User;

import com.example.backendwebapplications.users.domain.model.aggregates.User.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository  extends JpaRepository<User,Integer> {
    Optional<User>findByUsername(String username);
}
