package com.codeandapps.structurals.flyweight;

public class Client {

    public static void main(String[] args) {
        // Crear un objeto FlyweightFactory
        SocialIconFactory factory = new SocialIconFactory();

        // Obtener o crear objetos Flyweight
        SocialIcon flyweight1 = factory.getIcon("Facebook");
        SocialIcon flyweight2 = factory.getIcon("Twitter");
        SocialIcon flyweight3 = factory.getIcon("Instagram"); // Reutiliza el existente

        // Usar los objetos Flyweight
        System.out.println(flyweight1.render(2,3,"http://facebook.com"));
        System.out.println(flyweight2.render(5,6,"http://twitter.com"));
        System.out.println(flyweight3.render(8,9,"http://instagram.com"));
    }
}
