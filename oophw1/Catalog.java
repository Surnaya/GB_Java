package org.example.oophw1;

import java.util.ArrayList;
import java.util.List;

public class Catalog{
    private List<Category> catalog;
    public Catalog() {
        this.catalog = new ArrayList<>();
    }
    public List<Category> getCatalog() {
        return catalog;
    }

    public void setCatalog(List<Category> catalog) {
        this.catalog = catalog;
    }

    protected void addCatalog(Category category){
        catalog.add(category);
    }
    public void printCatalog(){
        for (Category category : catalog) {
            System.out.println(category.getNameCategory());
            List<Product> products = category.getArrayProduct();
            for(Product product: products){
                System.out.println(product.getName() + " - " + product.getPrice() + " - " + product.getRating());

            }
        }
    }


}
