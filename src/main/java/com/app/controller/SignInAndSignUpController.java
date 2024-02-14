package com.app.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class SignInAndSignUpController {
    @PostMapping("/signin")
    ResponseEntity<?> userSignIn(){
        return null;
    }

    @PostMapping("/signup")
    ResponseEntity<?> userSignUp(){
        return null;
    }
}
