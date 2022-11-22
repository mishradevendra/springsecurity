package com.learn.services;

import com.learn.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    List<User> list = new ArrayList<>();

    public UserService() {
        list.add(new User("Devendra", "abc","abc@gmail.com"));
        list.add(new User("Deva", "xyz","xyz@gmail.com"));
        list.add(new User("Dev", "pqr","pqr@gmail.com"));
    }

//all user
    public List<User> getAllUser(){
        return this.list;
    }
    //get user by name
    public User getUserName(String name){
        return this.list.stream().filter(user -> user.getUserName().equals(name)).findAny().orElse(null);
    }

    //add user
    public User createUser(User user){
       this.list.add(user);
       return user;

    }
}
