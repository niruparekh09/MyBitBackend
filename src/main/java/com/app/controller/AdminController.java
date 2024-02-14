package com.app.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")
public class AdminController {

    @GetMapping("/users")
    ResponseEntity<?> getAllUsers(){
        return null;
    }

    @GetMapping("/users/{city}")
    ResponseEntity<?> getUsersByCity(){
        return null;
    }

    @GetMapping("/announceReq")
    ResponseEntity<?> approveRequest(@RequestBody String id){
        //fetch AnnounceReq from db and then delete it from it and transfer to Announcement collection
        return null;
    }
}
