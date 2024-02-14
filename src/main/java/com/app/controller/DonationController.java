package com.app.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/donation")
public class DonationController {
    @GetMapping("/list")
    ResponseEntity<?> getDonationList() {
        return null;
    }

    @PostMapping("/makeDonation")
    ResponseEntity<?> makeDonation() {
        return null;
    }

    @GetMapping("/payment/{amount}")
    ResponseEntity<?> payment(@PathVariable int amount) {
        return null;
    }
}
