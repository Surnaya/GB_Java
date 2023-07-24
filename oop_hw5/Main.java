package org.example.oop_hw5;


import org.example.oop_hw5.controller.Controller;

import static org.example.oop_hw5.model.Format.DOC;
import static org.example.oop_hw5.model.Format.PDF;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.createSub("Tom", "Ford", "rty@fap", "+89544");
        controller.createSub("Max", "Smith", "rty@fap", "+84544");
        controller.getSub(PDF);
        controller.getSub(DOC);
    }
}
