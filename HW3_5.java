package org.example.lesson3;

import java.util.Arrays;

public class HW3_5 {
    public static void main(String[] args) {
        /**
         * при входном массиве, вернуть массив массивов со всеми перестановками его элементов. (со звездочкой)
         * Пример входных данных:
         * [1,2,3]
         * Пример выходных данных:
         * [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
         *
         * Для решения задачи использован алгоритм Джонсона-Троттера
         */
        transGen(3);
    }

    /**
     * @apiNote метод перестановки
     * @param transposition массив перестановок
     * @param trand массив направлений
     * @param i, j элементы последовательности
     */
    public static  void swap(int[] transposition, int[] trand, int i, int j){
        int transpositionTemp = transposition[i];
        transposition[i]  = transposition[j];
        transposition[j] = transpositionTemp;

        int trandTemp = trand[i];
        trand[i] = trand[j];
        trand[j] = trandTemp;

    }

    /**
     * @apiNote метод изменения направления
     * @param transposition массив перестановок
     * @param trand массив направлений
     * @param mobileElement максимальный мобильный элемент
     */
    public static void changeTrand( int[] transposition, int[] trand, int mobileElement){
        for (int i = 0; i < transposition.length; i++) {
            if(transposition[i] > mobileElement){
                trand[i] = trand[i]*(-1);
            }
        }
    }

    /**
     * @apiNote метод поиска максимального мобильного элемента
     * @param transposition массив перестановок
     * @param trand массив направлений
     * @return index
     */
    public static int maxMobileElement(int[] transposition, int[] trand){
        int index = -1;
        for (int i = 0; i < transposition.length; i++) {
            int nextIndex = i + trand[i];
            if (nextIndex >= 0 && nextIndex < transposition.length) {
                if(transposition[i] > transposition[nextIndex]){
                    if (index == -1){
                        index = i;
                    } else {
                        if (transposition[i] > transposition[index]){
                            index = i;
                        }
                    }
                }
            }
        }
        return index;
    }

    /**
     * @apiNote метод, который возвращает все перестановки длинной n
     * @param n длина массива
     */
    public static void transGen(int n){
        int[] transposition = new int[n]; // массив перестановок
        int[] trand = new int[n]; // массив направлений
        for (int i = 0; i < transposition.length; i++) {
            transposition[i] = i + 1;
            trand[i] = -1;
        }
        System.out.println(Arrays.toString(transposition));
        int mobileElementIndex = maxMobileElement(transposition, trand);
        for(; mobileElementIndex != -1;){
            int mobileElement = transposition[mobileElementIndex];
            int nextIndex = mobileElementIndex + trand[mobileElementIndex];
            swap(transposition, trand, mobileElementIndex, nextIndex);
            changeTrand(transposition, trand, mobileElement);
            System.out.println(Arrays.toString(transposition));
            mobileElementIndex = maxMobileElement(transposition,trand);

        }
    }
}
