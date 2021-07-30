package com.example.model.service.impl;

import com.example.model.entity.User;
import com.example.model.repository.UserRepository;
import com.example.model.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserService {
    @Autowired
    UserRepository userRepository;
    @Override
    public void save(User user) {
        userRepository.save(user);
    }
}
