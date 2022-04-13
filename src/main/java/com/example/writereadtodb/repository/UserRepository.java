package com.example.writereadtodb.repository;

import com.example.writereadtodb.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {

    Optional<User> findUserByLogin(String username);

    User findUserByFirstName(String name);
}
