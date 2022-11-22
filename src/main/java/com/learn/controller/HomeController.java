package com.learn.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/public")
public class HomeController {

  //  @PreAuthorize("hasRole('ADMIN')")
    @GetMapping("/home")
    public String getHome() {
        return "This is Home Page";
    }

    @GetMapping("/login")
    public String getLogin() {
        return "This is Login Page";
    }

    @GetMapping("/registration")
    public String getRegistration() {
        return "This is Registration Page";
    }

}
