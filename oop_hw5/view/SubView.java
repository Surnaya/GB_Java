package org.example.oop_hw5.view;

import org.example.oop_hw5.model.Subscriber;

public class SubView {

    public void printConsolePdf(Subscriber subscriber){
        System.out.println("Format PDF = " + subscriber.toString());
    }

    public void printConsoleDoc(Subscriber subscriber){
        System.out.println("Format DOC = " + subscriber.toString());
    }

}
