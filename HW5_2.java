package org.example.lesson5;

import java.util.*;
import java.util.stream.Collectors;

public class HW5_2 {

    public static void main(String[] args) {
        /**
         * Написать программу, которая найдёт и выведет повторяющиеся
         * имена с количеством повторений. Отсортировать по убыванию популярности.
         */
        String[] staff = new String[]{
                "Павел Чернов", "Петр Лыков", "Иван Ежов", "Петр Петин", "Иван Мечников", "Анна Владимирова",
                "Марина Лугова", "Мария Рыкова", "Мария Савина", "Марина Светлова", "Мария Федорова", "Петр Чернышов",
                "Иван Юрин", "Иван Иванов", "Анна Крутова", "Анна Мусина", "Кристина Белова", "Светлана Петрова"};
        Map<String, Integer> mapStaff = new HashMap<>();
        for (int i = 0; i < staff.length; i++) {
            String[] name = staff[i].split(" ");
            mapStaff.putIfAbsent(name[0], 0);
            mapStaff.put(name[0], mapStaff.get(name[0])+1);
        }
        Map<String, Integer> sortedStaff = mapStaff.entrySet()
                .stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (oldValue, newValue) -> oldValue, LinkedHashMap::new));
        for (Map.Entry<String, Integer> entity: sortedStaff.entrySet()){
            System.out.println("Имя " + entity.getKey() +" встречается  " + entity.getValue() + " раз(а)");
        }
    }
}
