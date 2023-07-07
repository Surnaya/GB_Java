package org.example.homework6;


import java.util.*;

public class Operations {

    private Set<Notebooks> notebooks = new HashSet<>();
    private static Scanner scanner = new Scanner(System.in);

    public void printList() {
        for (Notebooks notebook : notebooks) {
            System.out.println(notebook);
        }
    }

    public Operations(Set<Notebooks> notebooks) {
        this.scanner = new Scanner(System.in);
        this.notebooks = notebooks;
    }

    public String getOperations() {

        String text = "Выберите опрерацию: \n " +
                "1. Вывести список \n " +
                "2. Завершить";

        System.out.println(text);

        String answer = scanner.next();

        return answer;
    }

    public void start() {

        boolean flag = true;
        while (flag) {

            String operation = getOperations();
            if (operation.equals("2")) {
                flag = false;
                scanner.close();
                continue;
            } else if (operation.equals("1")) {
                printList();
            }
        }
    }
}
