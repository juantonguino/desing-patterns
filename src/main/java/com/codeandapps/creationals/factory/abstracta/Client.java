package com.codeandapps.creationals.factory.abstracta;

public class Client {
    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant();
        restaurant.orderComboPremium();
        restaurant.orderComboJunior();
    }
}
