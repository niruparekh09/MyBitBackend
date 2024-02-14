package com.app.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ngo")
public class NgoController {

    @GetMapping("/list")
    ResponseEntity<?> getNgoList(){
        return null;
    }

    @GetMapping("/{name}/info")
    ResponseEntity<?> getNgoInfo(@PathVariable String name){
        return null;
    }

    @PostMapping("/request")
    ResponseEntity<?> makeAnnounceRequest(){
        return null;
    }
}


