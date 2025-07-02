package com.codeandapps.structurals.decorator;

public class Client {
    public static void main(String[] args) {
        // Create a base beverage
        Bebida bebida = new Cafe();

        // Decorate the beverage with milk
        bebida = new BebidaConLeche(bebida);

        // Print the description and cost of the decorated beverage
        System.out.println("Descripción: " + bebida.getDescripcion());
        System.out.println("Costo: " + bebida.getCosto());

        // Decorate the beverage with chocolate
        bebida = new BebidaConChocolate(bebida);
        // Print the description and cost of the fully decorated beverage
        System.out.println("Descripción: " + bebida.getDescripcion());
        System.out.println("Costo: " + bebida.getCosto());
    }
}
