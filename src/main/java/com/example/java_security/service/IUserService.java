package com.example.java_security.service;

import com.example.java_security.models.User;

public interface IUserService {

    User findByUsername(String username);
}
