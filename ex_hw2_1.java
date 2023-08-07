package org.example.ex2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ex_hw2_1 {
    /**
     * Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
     * и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению
     * приложения, вместо этого, необходимо повторно запросить у пользователя ввод данных.
     */
    public static void main(String[] args) {
        floatFunc();
    }
    public static void floatFunc(){
        while (true){
            try{
                Scanner scanner = new Scanner(System.in);
                System.out.println("Input number: ");
                System.out.println(scanner.nextFloat());
                break;
            } catch (InputMismatchException e){
                System.out.println("Not float. Try again.");
            }
        }
    }
}
