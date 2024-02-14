package com.app.service;

import com.app.repository.DonationRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class DonationServiceImpl implements DonationService{

    @Autowired
    DonationRepository donationRepo;
}
