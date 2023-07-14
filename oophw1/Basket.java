package org.example.oophw1;

import java.util.ArrayList;
import java.util.List;

public class Basket {
    private List<Product> products;

    public Basket() {
        this.products = new ArrayList<>();
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
    /**
     * @apiNote метод добавляет товар в корзину
     * @param product товар
     */
    protected void addProductToBasket(Product product){
        products.add(product);
    }

    /**
     * @apiNote метод удаляет товар из корзины
     * @param product товар
     */
    protected void deleteProductToBasket(Product product){
        products.remove(product);
    }
}
