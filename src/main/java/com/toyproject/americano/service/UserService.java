package com.toyproject.americano.service;

import com.toyproject.americano.entity.User;
import com.toyproject.americano.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class UserService {
    private final UserRepository userRepository;
    @Autowired
    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }
    public User getUserById(Long id) {
        return userRepository.findById(id).orElse(null);
    }
}
