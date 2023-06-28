package org.example.lesson3.HW3_3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HW3_3 {
    public static void main(String[] args) {
        //Сведения о книге состоят из названия, фамилии автора, цены, года издания и
        // количества страниц. Найти названия книг, в которых простое количество страниц,
        // фамилия автора содержит «А» и год издания после 2010 г, включительно.
        List<Books> bookList = createBookList();
        for (int i = 0; i < bookList.size(); i++) {
            if(bookList.get(i).getYear() >= 2010
                    && (bookList.get(i).getAuthor().contains("a") || bookList.get(i).getAuthor().contains("A"))
                    && checkSimple(bookList.get(i).getPage()) == true){
                System.out.println(bookList.get(i));
            }
        }
    }

    /**
     * @apiNote метод нахождения простого числа
     * @param page число
     * @return true простое число
     */
    public static boolean checkSimple(int page){
        int k = 0;
        int j = 2;
        while (j*j <= page && k!=1){
            if (page%j == 0){
                k =1;
                j +=1;
            } else {
                j +=1;
            }
        }
        if (k != 1){
            return true;
        } else return false;
    }

    private static List<Books> createBookList() {
        List<Books> resultList = new ArrayList<>();
        resultList.add(new Books("dfcv", "Ahjfcn", 250, 1987, 193));
        resultList.add(new Books("gbnm", "kbA", 250, 2014, 17));
        resultList.add(new Books("bbnmk", "lkdjcna", 250, 2011, 109));
        resultList.add(new Books("viuytgf", "fdsd", 250, 2016, 246));
        resultList.add(new Books("jhgfc", "kjabvs", 250, 2017, 157));

        return resultList;
    }
}
