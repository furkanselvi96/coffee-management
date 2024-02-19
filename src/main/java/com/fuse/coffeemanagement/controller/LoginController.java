package com.fuse.coffeemanagement.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/login")
public class LoginController {

    @GetMapping("/ping")
    public String ping() {
        return "SERVICE RUNNING";
    }




}
