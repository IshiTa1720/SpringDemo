package com.ishita.mongodb.repository;

import com.ishita.mongodb.model.Contact;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;


public interface ContactRepository extends MongoRepository<Contact,String> {
    List<Contact> findByRelationship(String relationship);
}
