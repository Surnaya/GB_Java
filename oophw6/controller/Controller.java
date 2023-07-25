package org.example.oophw6.controller;

import org.example.oophw6.model.*;
import org.example.oophw6.service.ContactService;
import org.example.oophw6.view.ContactView;

import java.util.List;

public class Controller {
    private final ContactService service = new ContactService();
    private final ContactView contactView = new ContactView();
    public void createNewContact(String name, String surname, String email, String phone){
        service.addContact(name, surname, email, phone);
    }
    public void getPhoneBook(){
        List<Contact> phoneBook = service.read();
        for (Contact contact : phoneBook) {
            contactView.printConsole(contact);
        }
    }
    public void getFormat(Format format){
        List<Contact> formatPhoneBook = service.read();
        if (Format.DOC == format){
            ChangeFormat changeDoc = new DocFormat();
            changeDoc.changeFormat(formatPhoneBook);
        }else if (Format.PDF == format){
            ChangeFormat changePdf = new PdfFormat();
            changePdf.changeFormat(formatPhoneBook);
        } else if (Format.TXT == format){
            ChangeFormat changeTxt = new TxtFormat();
            changeTxt.changeFormat(formatPhoneBook);
        }
    }

    public void searchContact(String searchWord){
        if(service.search(searchWord).size() != 0){
            System.out.println(service.search(searchWord));
        } else {
            System.out.println("Contact not found");
        }
    }
}
