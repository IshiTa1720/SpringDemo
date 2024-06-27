package com.ishita.jpadb.controller;

import com.ishita.jpadb.model.Contact;
import com.ishita.jpadb.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
    public ResponseEntity<?> readContact(@RequestParam int id){
        return contactService.readContact(id);
    }

}
