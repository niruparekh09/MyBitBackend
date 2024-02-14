package com.app.repository;

import com.app.enities.DonationTable;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface DonationTableRepository extends MongoRepository<DonationTable, String> {
}
