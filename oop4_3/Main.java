package org.example.oop4_3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        List<Double> doubleList  = new ArrayList<>();
        for (int i = 1; i < 5; i++) {
            doubleList.add((double) i);
        }
        System.out.println("сумма массива чисел " + doubleList+ " = " + calculator.sum(doubleList));
        System.out.println("произведение массива чисел " + doubleList+ " = " + calculator.mult(doubleList));

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 1 число ");
        Integer num1 = scanner.nextInt();
        System.out.println("Введите 2 число ");
        Integer num2 = scanner.nextInt();
        System.out.println("результат деления числа "+ num1 + " на число "+ num2+ " = " +calculator.div(num1, num2));

        Double num3 = 6.0;
        Integer num4 = 11;
        String num5 = "3";
        System.out.println("Число " + num3 + " = " + calculator.bin(num3));
        System.out.println("Число " + num4 + " = " + calculator.bin(num4));
        System.out.println("Число " + num5 + " = " + calculator.bin(num5));

    }
}
