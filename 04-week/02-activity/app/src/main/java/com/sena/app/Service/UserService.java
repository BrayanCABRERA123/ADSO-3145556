package com.sena.app.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sena.app.Entity.User;
import com.sena.app.IRepository.IUserRepository;

@Service
public class UserService {

    @Autowired
    private IUserRepository userRepository;
    
    public User save(User user) {
        return userRepository.save(user);
    }

    public boolean login(String username, String password) {
        User user = userRepository.findByUsername(username);
        return user != null && user.getPassword().equals(password);
    }

    public void changePassword(Long userId, String newPassword) {
        User user = userRepository.findById(userId).orElseThrow();
        user.setPassword(newPassword);
        userRepository.save(user);
    }   

    public void updateAddress(Long userId, String address) {
        User user = userRepository.findById(userId).orElseThrow();
        user.setAddress(address);
        userRepository.save(user);
    }

    public List<User> All() {
        return userRepository.findAll();
    }
}