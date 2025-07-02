package com.codeandapps.structurals.decorator;

public sealed abstract class BebidaDecorador implements Bebida permits BebidaConLeche, BebidaConChocolate {
    protected Bebida bebida;

    public BebidaDecorador(Bebida bebida) {
        this.bebida = bebida;
    }

    @Override
    public String getDescripcion() {
        return bebida.getDescripcion();
    }

    @Override
    public double getCosto() {
        return bebida.getCosto();
    }
}