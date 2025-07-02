package com.codeandapps.structurals.decorator;

public non-sealed class BebidaConChocolate extends BebidaDecorador{

    public BebidaConChocolate(Bebida bebida) {
        super(bebida);
    }

    public String getDescripcion() {
        return bebida.getDescripcion() + ", Chocolate";
    }
    public double getCosto() {
        return bebida.getCosto() + 1; // 0.75 dólares por el chocolate
    }
}
