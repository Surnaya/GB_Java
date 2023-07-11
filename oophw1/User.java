package org.example.oophw1;

import java.util.List;

public class User{
    private String login;
    private Integer password;
    private Basket basket;


    public User(String login, Integer password) {
        this.login = login;
        this.password = password;
        this.basket = new Basket();
    }

    public User() {
    }

    public String getLogin() {

        return login;
    }

    public void setLogin(String login) {

        this.login = login;
    }

    public Integer getPassword() {

        return password;
    }

    public void setPassword(Integer password) {

        this.password = password;
    }

    public Basket getBasket() {

        return basket;
    }

    public void setBasket(Basket basket) {

        this.basket = basket;
    }


    /**
     * @apiNote метод вывода купленных товаров
     */
    public void printBasket(){
        System.out.println(login + " Покупки:");
        List<Product> userBasket = basket.getProducts();
        for (Product product: userBasket) {
            System.out.println(product.getName() + " - " + product.getPrice() + " - " + product.getRating());
        }
    }

}
