package com.toyproject.americano.service;

import com.toyproject.americano.dto.UserReq;
import com.toyproject.americano.dto.UserRes;
import com.toyproject.americano.entity.User;
import com.toyproject.americano.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;
    public User createUser(UserReq userReq) {
        User user = new User();
        return userRepository.save(user);
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User getUserById(Long id) {
        return userRepository.findById(id).orElse(null);
    }

    public User updateUser(Long id, UserReq userReq) {
        User user = userRepository.findById(id).orElse(null);
        if (user != null) {
            user.setEmail(userReq.getEmail());
            return userRepository.save(user);
        }
        return null;
    }

    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }

    private User convertToEntity(UserReq userReq){
        return null;
    }

    private UserRes convertToResponse(User user){
        return null;
    }
}
