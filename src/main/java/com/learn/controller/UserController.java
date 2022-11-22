package com.learn.controller;

import com.learn.model.User;
import com.learn.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/")
    public List<User> getAllUser(){
       return this.userService.getAllUser();
    }

    @GetMapping("/{name}")
    public User getUserName(@PathVariable("name") String name) {
        return this.userService.getUserName(name);
    }

    @PostMapping("/")
    public User addUser(@RequestBody User user){
        return this.userService.createUser(user);
}
}
