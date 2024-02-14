package com.app.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/announcement")
public class AnnouncementController {
    @GetMapping("/list")
    ResponseEntity<?> getAnnouncementList(){
        return null;
    }

    @GetMapping("/add")
    ResponseEntity<?> addAnnouncement(){
        return null;
    }
}