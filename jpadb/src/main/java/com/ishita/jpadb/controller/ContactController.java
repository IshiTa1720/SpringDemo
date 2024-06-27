package com.ishita.jpadb.controller;

import com.ishita.jpadb.model.Contact;
import com.ishita.jpadb.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController("/contact")
public class ContactController {

    @Autowired
    ContactService contactService;

    @PostMapping
    @ResponseBody
    public Contact saveContact(@RequestBody Contact contact){
        return contactService.saveContact(contact);
    }

    @GetMapping
    public Contact readContact(@RequestParam int id){
        return contactService.readContact(id);
    }

}
