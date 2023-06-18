package org.example.lesson1.HomeWork;

import java.util.Scanner;

public class HW1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String myStr = sc.nextLine();
        System.out.println(strReverse(myStr));
    }

    /**
     * @param reverseStr изменяемая строка
     * @return newStr перевернтая строка
     * @apiNote Учитывая входную строку s, измените порядок слов на противоположный.
     * Слово определяется как последовательность не пробельных символов. Слова в s будут разделены хотя бы одним пробелом.
     * Возвращает строку слов в обратном порядке, объединенных одним пробелом.
     * Обратите внимание, что s может содержать начальные или конечные пробелы или несколько пробелов между двумя словами. Возвращаемая строка должна содержать только один пробел, разделяющий слова. Не включайте никаких дополнительных пробелов.
     */
    private static String strReverse(String reverseStr) {
        String newStr = "";
        for (String words : reverseStr.trim().split(" ")) {
            newStr = words + " " + newStr;
        }
        return newStr;
    }
}
