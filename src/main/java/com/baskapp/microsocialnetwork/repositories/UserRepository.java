package com.baskapp.microsocialnetwork.repositories;

import com.baskapp.microsocialnetwork.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
