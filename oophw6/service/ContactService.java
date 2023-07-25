package org.example.oophw6.service;

import org.example.oop6_1.Book;
import org.example.oophw6.model.Contact;

import java.util.ArrayList;
import java.util.List;

public class ContactService implements DataService, SearchContact{
    private List<Contact> contactsList = new ArrayList<>();
    // создаем массив из контактов - телефонную книгу
    @Override
    public void addContact(String name, String surname, String email, String phone) {
        Contact contact = new Contact(name, surname, email, phone);
        contactsList.add(contact);
    }
    // получаем массив из контактов чтение
    @Override
    public List<Contact> read() {
        return contactsList;
    }

    @Override
    public List<Contact> search(String searchWord) {
        List<Contact> resultContact = new ArrayList<>();
        for (Contact contact : contactsList) {
            if(contact.getName().equals(searchWord)){
                resultContact.add(contact);
            } else if(contact.getSurname().equals(searchWord)){
                resultContact.add(contact);
            } else if(contact.getEmail().equals(searchWord)){
                resultContact.add(contact);
            } else if(contact.getPhone().equals(searchWord)){
                resultContact.add(contact);
            }
        }
        return resultContact;
    }
}
