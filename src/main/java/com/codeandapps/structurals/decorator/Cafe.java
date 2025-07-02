package com.codeandapps.structurals.decorator;

public class Cafe implements Bebida {
    @Override
    public String getDescripcion() {
        return "Café solo";
    }

    @Override
    public double getCosto() {
        return 2.0; // 2 dólares, por ejemplo
    }
}
