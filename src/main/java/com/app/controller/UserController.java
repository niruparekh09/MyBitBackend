package com.app.controller;

import com.app.enities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @PostMapping("/add/ngo")
    ResponseEntity<?> addNgo(@RequestBody User /*Use DTO here*/ newNgo){
        return null;
    }

    @PostMapping("/add/donor")
    ResponseEntity<?> addDonor(@RequestBody User /*Use DTO here*/ newNgo){
        return null;
    }
}
