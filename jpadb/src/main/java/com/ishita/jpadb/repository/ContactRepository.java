package com.ishita.jpadb.repository;

import com.ishita.jpadb.model.Contact;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ContactRepository extends JpaRepository<Contact,Integer> {

}
