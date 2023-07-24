package org.example.oop_hw5.controller;

import org.example.oop_hw5.model.Format;
import org.example.oop_hw5.model.Subscriber;
import org.example.oop_hw5.service.SubService;
import org.example.oop_hw5.view.SubView;

import java.util.List;

public class Controller {
    private final SubService service = new SubService();
    private final SubView subView = new SubView();

    public void createSub(String name, String surname, String email, String phone) {
        service.addSubscriber(name, surname, email, phone);
    }

    public void getSub(Format format) {
        if (Format.PDF == format) {
            List<Subscriber> subList = service.read();
            for (Subscriber sub : subList) {
                subView.printConsolePdf(sub);
            }
        }
        if (Format.DOC == format) {
            List<Subscriber> subList = service.read();
            for (Subscriber sub : subList) {
                subView.printConsoleDoc(sub);
            }
        }
    }
}


