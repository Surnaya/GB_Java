package org.example.oophw6.model;

import java.util.List;

public class TxtFormat implements ChangeFormat{
    @Override
    public void changeFormat(List<Contact> contacts) {
        for (Contact contact : contacts) {
            System.out.println(contact.getName() + " " +  contact.getPhone() + " format " + Format.TXT);
        }
    }
}
