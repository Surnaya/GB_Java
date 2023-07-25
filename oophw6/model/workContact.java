package org.example.oophw6.model;

public class workContact extends Contact{
    String position;

    public workContact(String name, String surname, String email, String phone, String position) {
        super(name, surname, email, phone);
        this.position = position;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
