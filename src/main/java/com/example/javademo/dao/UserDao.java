package com.example.javademo.dao;

import com.example.javademo.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface UserDao {

    List<User> queryUsers(@Param("userName") String userName);

    void addUser(@Param("user") User user);

    User getById(@Param("userId") Integer userId);

    void deleteById(@Param("userId") Integer userId);

    void update(User user);

}
