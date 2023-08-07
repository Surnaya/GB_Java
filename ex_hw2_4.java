package org.example.ex2;

import java.util.Scanner;

public class ex_hw2_4 {
    /**
     * Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
     * Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String myString = scanner.nextLine();
        if(myString.isEmpty()){
            throw new RuntimeException("Пустые строки вводить нельзя");
        } else {
            System.out.println(myString);
        }
    }

}
