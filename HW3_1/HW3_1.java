package org.example.lesson3.HW3_1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HW3_1 {
    public static void main(String[] args) {

        List<Product> products = createProducts();
        Set<Integer> setPrices = new HashSet<>();
        /**
         * Найти наибольшую цену товаров 1го или 2-го сорта среди товаров,
         * название которых содержит «высший».
         */
        // Находим цену товаров, оканчивающихся на "высший" и добавляем в setPrices
        for (int i=0; i <products.size(); i++) {
            if (products.get(i).getProductName().endsWith("высший") && (products.get(i).getGrade() == 1 || products.get(i).getGrade() == 2)) {
                setPrices.add(products.get(i).getPrice());
            }
        }
        // Находим максимальную цену
        int max = 0;
        for (int s: setPrices) {
            if (s > max) {
                max = s;
            }
        }
        System.out.println("Максимальная цена среди товаров " + max);
    }

    /**
     * @apiNote Создание массива записей: наименование товара, цена, сорт.
     * @return массив
     */
    private static List<Product> createProducts() {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Слива высший", 250, 1));
        products.add(new Product("Груша", 125, 2));
        products.add(new Product("Яблоко высший", 226, 3));
        products.add(new Product("Виноград", 327, 2));
        products.add(new Product("Персик высший", 427, 2));
        products.add(new Product("Банан", 100, 1));

        return products;
    }
}
