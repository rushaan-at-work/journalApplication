package com.example.journalApp.Service;

import com.example.journalApp.Entity.User;
import com.example.journalApp.repository.UserEntryRepo;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class UserService {

    @Autowired
    private UserEntryRepo userEntryRepo;

    public void saveEntry(User journalEntry){
        userEntryRepo.save(journalEntry);
    }

    public List<User> getAll(){
        return userEntryRepo.findAll();
    }

    public Optional<User> findById(ObjectId id){
        return userEntryRepo.findById(id);
    }

    public void deleteJournalEntryById(ObjectId id){
        userEntryRepo.deleteById(id);
    }

    public User findByUserName(String userName){
        return userEntryRepo.findByUserName(userName);
    }
}
