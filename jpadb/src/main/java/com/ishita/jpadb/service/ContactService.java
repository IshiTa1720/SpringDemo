package com.ishita.jpadb.service;

import com.ishita.jpadb.model.Contact;
import com.ishita.jpadb.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class ContactService {
    @Autowired
    ContactRepository contactRepository;

    public Contact saveContact(Contact contact){ //to save the contact into the DB
        return contactRepository.save(contact);
    }

    public Contact readContact(int id){
        return contactRepository.getReferenceById(id);
    }
}
