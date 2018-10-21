package com.example.javademo.service;

import com.example.javademo.model.User;

import java.util.List;

public interface UserService {

    List<User> queryUsers(String userName);

    void addUser(User user);

    User getById(Integer userId);

    void deleteById(Integer userId);

    void update(User user);

}
