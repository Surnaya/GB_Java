package org.example.oophw6.service;

import org.example.oophw6.model.Contact;

import java.util.List;

public interface SearchContact {
    List<Contact> search(String searchWord);

}
