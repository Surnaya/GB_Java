package org.example.lesson3.HW3_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HW3_2 {
    public static void main(String[] args) {
        // Сведения о товаре состоят из наименования, страны-производителя, веса, цены, сорта.
        // Получить наименования товаров заданного сорта с наименьшей ценой.
        List<Product_List> productLists = createProductL();
        List<Product_List> gradeList = new ArrayList<>();
        List <String> minList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сорт ");
        int q = scanner.nextInt();

        for (int i = 0; i <productLists.size(); i++){
            if(productLists.get(i).getGrade() == q){
                gradeList.add(productLists.get(i));
            }
        }
        System.out.println(gradeList);

        int minPrice = gradeList.get(0).getPrice();

        for (int j = 1; j < gradeList.size(); j++) {
            if(minPrice > gradeList.get(j).getPrice()){
                minPrice = gradeList.get(j).getPrice();
            }
            for (int i = 0; i < gradeList.size(); i++) {
                if(minPrice == gradeList.get(i).getPrice()){
                    minList.add(gradeList.get(i).getProductName());
                }
            }
        }
        System.out.println("Товар с минимальной ценой:  " + minList);
        System.out.println("Цена " + minPrice);
    }
    private static List<Product_List> createProductL() {
        List<Product_List> productLists = new ArrayList<>();
        productLists.add(new Product_List("apple", "Russia", 35.3, 125, 1));
        productLists.add(new Product_List("orange", "Morocco", 75.3, 175, 2));
        productLists.add(new Product_List("banana", "Ecuador", 42.1, 70, 3));
        productLists.add(new Product_List("grape", "Spain", 16.1, 250, 1));
        productLists.add(new Product_List("melon", "Uzbekistan", 23.4, 135, 2));
        productLists.add(new Product_List("pear", "Russia", 11.4, 70, 3));
        productLists.add(new Product_List("plum", "Russia", 67.2, 110, 1));

        return productLists;
    }
}
