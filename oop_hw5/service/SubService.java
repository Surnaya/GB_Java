package org.example.oop_hw5.service;

import org.example.oop_hw5.model.Subscriber;
import java.util.ArrayList;
import java.util.List;

public class SubService implements DataService{
    private List<Subscriber> subscriberList = new ArrayList<>();
    @Override
    public void addSubscriber(String name, String surname, String email, String phone) {
        Subscriber subscriber = new Subscriber(name, surname, email, phone);
        subscriberList.add(subscriber);
    }

    @Override
    public List<Subscriber> read(){
        return subscriberList;
    }
}
