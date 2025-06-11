package com.example.journalApp.repository;

import com.example.journalApp.Entity.User;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserEntryRepo extends MongoRepository<User, ObjectId> {
    User findByUserName(String userName);
}
