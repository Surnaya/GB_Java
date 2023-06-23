package org.example.lesson2.HomeWork;

import java.util.Scanner;

public class HW2_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Задайте максимальное количество чисел в последовательности N ");
        int n = sc.nextInt();
        System.out.println("Последовательность является возрастающей? " + numbIncrement(n, sc));
    }

    /**
     * apiNote Дана последовательность из N целых чисел.
     *         Верно ли, что последовательность является возрастающей.
     * @param n количество чисел в последовательности
     * @param sc числа
     * @return возрастающая или нет последовательность
     */
    private static boolean numbIncrement(int n, Scanner sc) {
        System.out.println("Введите числа: ");
        int firstNum = sc.nextInt();
        for (int i = 0; i < n - 1; i++){
            int secondNum = sc.nextInt();
            if(firstNum > secondNum){
                return false;
            }
            firstNum = secondNum;
        }
        return true;
    }
}
