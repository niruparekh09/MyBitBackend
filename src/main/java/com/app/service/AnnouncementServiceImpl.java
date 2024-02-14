package com.app.service;

import com.app.repository.AnnouncementRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class AnnouncementServiceImpl implements AnnouncementService{

    @Autowired
    AnnouncementRepository announcementRepo;
}
