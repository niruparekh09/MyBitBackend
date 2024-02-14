package com.app.service;

import com.app.repository.DonationTableRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class DonationTableServiceImpl implements DonationTableService{

    @Autowired
    DonationTableRepository donationTableRepo;
}
