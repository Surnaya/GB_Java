package org.example.lesson5;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class HW5_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "Россия, идет вперед всей планеты. Планета — это не Россия.";
        System.out.println(str);
        System.out.println("Введите слово: ");
        String word = sc.nextLine();
        cntWords(str, word);
    }
    /**
     * @apiNote Подсчитать количество искомого слова, через map (наполнением значение, где искомое слово будет являться ключом), вносить все слова не нужно
     *          игнорировать пунктуацию
     * @param str входящий текст
     * @param word словоБ которое необходимо найти
     */
    private static void cntWords(String str, String word) {
        Map<String, Integer> map = new HashMap<>();
        String[] words = str.split("[.,\\s]+");
        for (int i = 0; i < words.length; i++) {
            if(words[i].toLowerCase(Locale.ROOT).equals(word.toLowerCase())){
                map.putIfAbsent(words[i], 0);
                map.put(words[i], map.get(words[i])+1);
            }
        }
        for (Map.Entry<String, Integer> e: map.entrySet()){
            System.out.println("Слово " + e.getKey() +" встречается в тексте: " + e.getValue() + " раз(а)");
        }
    }
}
