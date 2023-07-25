package org.example.oophw6;

import org.example.oophw6.controller.Controller;
import org.example.oophw6.model.Format;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.createNewContact("Phil", "Coulson", "rty@rty", "+8678098");
        controller.createNewContact("Peggy", "Carter", "hgf@yu", "+45677");
        controller.createNewContact("Grant", "Ward", "jhg@yu", "+45677");

        controller.searchContact("Peggy");
        controller.searchContact("Tom");
        controller.searchContact("+45677");

        controller.getFormat(Format.DOC);

        controller.getPhoneBook();
    }
}
