package org.example.lesson3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class HW3_4 {
    public static void main(String[] args) {
        // Задан целочисленный список ArrayList.
        // Найти минимальное, максимальное и среднее из этого списка.
        List<Integer> myArray = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 15; i++) {
            myArray.add(random.nextInt(100));
        }
        System.out.println(myArray);
        System.out.println("Максимальное число из списка " + maxArray(myArray));
        System.out.println("Минимальное число из списка " + minArray(myArray));
        System.out.println("Среднее " + meanArray(myArray));
    }

    /**
     * @apiNote метод нахождения среднего арифметического
     * @param myArray входящий массив
     * @return среднее
     */
    private static int meanArray(List<Integer> myArray) {
        int sum = 0;
        for (int i = 0; i < myArray.size(); i++) {
            sum += myArray.get(i);
        }
        return sum / myArray.size();
    }

    /**
     * @apiNote Метод нахождения минмально числа из массива
     * @param myArray входяящий массив
     * @return минимальное значение
     */
    private static int minArray(List<Integer> myArray) {
        int min = myArray.get(0);
        for (int i = 1; i < myArray.size(); i++) {
            if(myArray.get(i) < min){
                min = myArray.get(i);
            }
        }
        return  min;
    }
    /**
     * @apiNote Метод нахождения максимального числа из массива
     * @param myArray входяящий массив
     * @return максимальное значение
     */
    private static int maxArray(List<Integer> myArray) {
        int max = 0;
        for (int i = 0; i < myArray.size(); i++) {
            if (myArray.get(i) > max) {
                max = myArray.get(i);
            }
        }
        return max;
    }
}
