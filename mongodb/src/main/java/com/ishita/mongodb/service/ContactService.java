package com.ishita.mongodb.service;

import com.ishita.mongodb.model.Contact;
import com.ishita.mongodb.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ContactService {
    @Autowired
    ContactRepository contactRepository;

    public ResponseEntity<Contact> saveContact(Contact contact) { //to save the contact into the DB
        contact = contactRepository.save(contact);
        return new ResponseEntity<>(contact, HttpStatus.CREATED);
    }

    public ResponseEntity<?> readContact(String id) {
        Optional<Contact> contact = contactRepository.findById(id);
        if(contact.isPresent()) {
            return new ResponseEntity<>(contact, HttpStatus.OK);
        }
        return new ResponseEntity<>("Contact Doesn't Exist", HttpStatus.NOT_FOUND);
    }
    public ResponseEntity<List<Contact>> getContactByRelationship(String relationship){
        List<Contact> contacts = contactRepository.findByRelationship(relationship);
        return new ResponseEntity<>(contacts, HttpStatus.OK);
    }
}
