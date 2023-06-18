package org.example.lesson1.HomeWork;

import java.util.Scanner;

public class HW2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер массива чисел: ");
        int size = sc.nextInt();
        int array[] = new int[size];
        System.out.println("Введите массив чисел:");
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println("Сумма положительных чисел = " + sumNumber(size, array));
    }

    /**
     * @param size  - размер массива
     * @param array - последовательность чисел
     * @return sum - сумма положительных чисел, после которых следует отрицательное число
     * @api Note Дана последовательность целых чисел, оканчивающаяся нулем.
     * Найти сумму положительных чисел, после которых следует отрицательное число.
     */
    private static int sumNumber(int size, int[] array) {
        int sum = 0;
        for (int i = 0; i < size - 1; i++) {
            if ((array[i] > 0) && (array[i + 1] < 0)) {
                sum = sum + array[i];
            }
        }
        return sum;
    }
}

