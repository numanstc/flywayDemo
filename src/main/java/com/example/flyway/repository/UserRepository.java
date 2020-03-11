package com.example.flyway.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.flyway.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
