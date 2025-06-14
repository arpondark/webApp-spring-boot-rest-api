package com.arpon.webApp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class LoginControler {
    @GetMapping("/login")
    public String login(){
        return "Login .....";
    }
}
