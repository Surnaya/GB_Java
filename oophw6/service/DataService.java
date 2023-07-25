package org.example.oophw6.service;

import org.example.oop_hw5.model.Subscriber;
import org.example.oophw6.model.Contact;

import java.util.List;

public interface DataService {
    void addContact(String name, String surname, String email, String phone);
    List<Contact> read();
}
