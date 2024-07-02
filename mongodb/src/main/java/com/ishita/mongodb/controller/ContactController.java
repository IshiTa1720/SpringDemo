package com.ishita.mongodb.controller;

import com.ishita.mongodb.model.Contact;
import com.ishita.mongodb.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/contacts")
public class ContactController {

    @Autowired
    ContactService contactService;

    @PostMapping
    public ResponseEntity<Contact> saveContact(@RequestBody Contact contact){
        return contactService.saveContact(contact);
    }

    @GetMapping
    public ResponseEntity<?> readContact(@RequestParam String id){
        return contactService.readContact(id);
    }

    @GetMapping("/relationship")
    public ResponseEntity<List<Contact>> getContactByRelationship(@RequestParam String relationship) {
        return contactService.getContactByRelationship(relationship);
    }

}
