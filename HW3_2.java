package org.example.lesson2.HomeWork;

public class HW3_2 {
    public static void main(String[] args) {
        int[] arr = {1, 22, 33, 44, 5, -5, -3, 23, -7};
        int[] res = changeFunc(arr);
        for (int n : res) {
            System.out.print(n + " ");
        }
    }

    /**
     * @apiNote //Дан массив целых чисел.
     *      Заменить отрицательные элементы на сумму индексов двузначных элементов массива.
     * @param array исходный массив
     * @return возвращаемый массив
     */
    private static int[] changeFunc(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++){
            if ((array[i] >= 10 && array[i] < 100) || (array[i] >= -100 && array[i] < -10)){
                sum +=array[i];
            }
        }
        for (int i = 0; i < array.length; i++){
            if (array[i]< 0){
                array[i] = sum;
            }
        }
        return array;
    }
}
