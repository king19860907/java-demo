package com.example.javademo.service.impl;

import com.example.javademo.dao.UserDao;
import com.example.javademo.model.User;
import com.example.javademo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public List<User> queryUsers(String userName) {
        return userDao.queryUsers(userName);
    }

    @Override
    public void addUser(User user) {
        userDao.addUser(user);
    }

    @Override
    public User getById(Integer userId) {
        return userDao.getById(userId);
    }

    @Override
    public void deleteById(Integer userId) {
        userDao.deleteById(userId);
    }

    @Override
    public void update(User user) {
        userDao.update(user);
    }
}
