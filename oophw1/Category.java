package org.example.oophw1;

import java.util.ArrayList;
import java.util.List;

public class Category {
    private String nameCategory;
    private List<Product> arrayProduct;

    public Category(String nameCategory) {
        this.nameCategory = nameCategory;
        this.arrayProduct = new ArrayList<>();
    }

    public Category() {
    }

    public String getNameCategory() {
        return nameCategory;
    }

    public void setNameCategory(String nameCategory) {
        this.nameCategory = nameCategory;
    }

    public List<Product> getArrayProduct() {
        return arrayProduct;
    }

    public void setArrayProduct(List<Product> arrayProduct) {
        this.arrayProduct = arrayProduct;
    }

    /**
     * @apiNote метод добавляет новый товар в соответсвующую категорию
     * @param product товар
     */
    protected void addProductToCategory(Product product){

        arrayProduct.add(product);
    }

    /**
     * @apiNote метод удаляет товар из категории
     * @param product товар
     */
    public void deleteProductFromCategory(Product product){
        arrayProduct.remove(product);
    }

}
