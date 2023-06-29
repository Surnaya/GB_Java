package org.example.lesson4;

import java.util.*;

public class HW4_1 {
    public static void main(String[] args) {
        LinkedList<Integer> listInt = createList();
        revertMethod(listInt);
        revertMethod2(listInt);
    }

    /**
     * @apiNote метод создает массив чисел
     * @return listInt массив
     */
    private static LinkedList<Integer> createList() {
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> listInt = new LinkedList<>();
        System.out.println("Сколько цифр содержит массив? ");
        int size = sc.nextInt();
        System.out.println("Введите числа: ");
        for (int i = 0; i < size; i++) {
            listInt.add(sc.nextInt());
        }
        System.out.println(listInt);
        return listInt;
    }

    /**
     * @apiNote Вывести список на экран в перевернутом виде (без массивов и ArrayList)
     * @param listInt исходный список
     */
    private static void revertMethod(List<Integer> listInt) {
        Stack<Integer> stackInt = new Stack<>();
        stackInt.addAll(listInt);
        listInt.clear();
        while (!stackInt.isEmpty()) {
            listInt.add(stackInt.pop());
        }
        System.out.println(listInt);
    }
    private static void revertMethod2(LinkedList<Integer> listInt) {
        LinkedList<Integer> listRevert = new LinkedList<>();
        for (int i = 0; i < listInt.size(); i++) {
            int item = listInt.get(i);
            listRevert.addFirst(item);
        }
        System.out.println(listRevert);
    }
}
