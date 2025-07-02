package com.codeandapps.structurals.adapter;

public class Client {

    public static void main(String[] args) {
        // Create an instance of EuropePlug
        EuropePlug europePlug = new EuropePlug();

        // Create an adapter for the EuropePlug to use it as an AmericanPlug
        AmericanPlug americanPlug = new AdapterPlugAmericanEurope(europePlug);

        // Use the adapter to connect the plug
        americanPlug.conect();
    }
}
