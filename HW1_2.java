package org.example.lesson2.HomeWork;

import java.util.Scanner;

public class HW1_2 {
    // Дана последовательность N целых чисел.
    // Найти сумму простых чисел.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Задайте максимальное количество чисел в последовательности N ");
        int n = scanner.nextInt();
        System.out.println(checkSimple(n, scanner));
    }

    /**
     * @apiNote Дана последовательность N целых чисел.
     *          Найти сумму простых чисел.
     * @param n количество цифр в последовательности
     * @param scanner последовательность цифр
     * @return сумма простых чисел в последовательности
     */
    public static int checkSimple(int n, Scanner scanner){
        int sum = 0;
        for (int i = 0; i < n; i++){
            System.out.println("Введите число: " + (i+1));
            int numb = scanner.nextInt();
            int k = 0;
            int j = 2;
            while (j*j <= numb && k!=1){
                if(numb%j == 0){
                    k =1;
                    j +=1;
                } else {
                    j +=1;
                }
            }
            if (k != 1){
                sum +=numb;
            }
        }
        return sum;
    }
}
