package com.app.service;

import com.app.repository.AnnounceRequestRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class AnnounceRequestServiceImpl implements AnnounceRequestService{

    @Autowired
    AnnounceRequestRepository announceRequestRepo;
}
