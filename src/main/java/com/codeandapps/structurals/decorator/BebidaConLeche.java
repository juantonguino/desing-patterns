package com.codeandapps.structurals.decorator;

public final class BebidaConLeche extends BebidaDecorador{

    public BebidaConLeche(Bebida bebida) {
        super(bebida);
    }

    @Override
    public String getDescripcion() {
        return bebida.getDescripcion() + ", Leche";
    }

    @Override
    public double getCosto() {
        return bebida.getCosto() + 0.5;
    }
}
