package com.example.javademo.dao;

import com.example.javademo.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface UserDao {

    List<User> queryUsers(String userName);

    void addUser(User user);

    User getById(Integer userId);

    void deleteById(Integer userId);

    void updateUser(User user);

}
