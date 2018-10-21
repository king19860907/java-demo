package com.example.javademo.controller;

import com.example.javademo.model.User;
import com.example.javademo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "",method = RequestMethod.GET)
    public List<User> list(String userName){
        return userService.queryUsers(userName);
    }

    @RequestMapping(value = "",method = RequestMethod.POST)
    public String add(@RequestBody User user){
        userService.addUser(user);
        return "success";
    }

    @RequestMapping(value = "/{userId}",method = RequestMethod.GET)
    public User getById(@PathVariable Integer userId){
        return userService.getById(userId);
    }

    @RequestMapping(value = "/{userId}",method = RequestMethod.DELETE)
    public String deleteById(@PathVariable Integer userId){
        userService.deleteById(userId);
        return "success";
    }

    @RequestMapping(value = "",method = RequestMethod.PATCH)
    public String update(@RequestBody User user){
        userService.update(user);
        return "succcess";
    }

}
