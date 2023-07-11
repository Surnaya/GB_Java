package org.example.oophw1;

public class main {
    public static void main(String[] args) {
        Category category1 = new Category("Cloth");
        category1.addProductToCategory(new Product("dress", 1500.99, 4.3));
        category1.addProductToCategory(new Product("t-shirt", 1399.99,4.8));
        category1.addProductToCategory(new Product("trousers", 3399.99,4.4));

        Category category2 = new Category("Hats");
        category2.addProductToCategory(new Product("cap", 499.12, 4.6));
        category2.addProductToCategory(new Product("hat", 145.87, 4.6));
        Catalog catalog = new Catalog();
        catalog.addCatalog(category1);
        catalog.addCatalog(category2);
        catalog.printCatalog();
        User user1 = new User("Tom", 111);
        User user2 = new User("Bob", 123);

        user1.getBasket().addProductToBasket(category1.getArrayProduct().get(1));
        user1.getBasket().addProductToBasket(category1.getArrayProduct().get(2));
        user2.getBasket().addProductToBasket(category2.getArrayProduct().get(0));
        System.out.println();
        user1.printBasket();
        System.out.println();
        user2.printBasket();
    }
}
