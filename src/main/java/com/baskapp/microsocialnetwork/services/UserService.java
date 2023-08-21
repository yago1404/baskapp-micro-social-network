package com.baskapp.microsocialnetwork.services;

import com.baskapp.microsocialnetwork.entities.User;
import com.baskapp.microsocialnetwork.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    public final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getAllPlayers() {
        User user = new User();
        user.rule = 2;
        return this.userRepository.findAll(Example.of(user));
    }

}
