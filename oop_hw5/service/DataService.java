package org.example.oop_hw5.service;

import org.example.oop_hw5.model.Subscriber;

import java.util.List;

public interface DataService {
    void addSubscriber(String name, String surname, String email, String phone);
    List<Subscriber> read();

}
