package com.example.fooddelivery.service;

import com.example.fooddelivery.model.User;

public interface UserService {
    User registerUser(String username, String password);

    User getUserByUsername(String username);
}
