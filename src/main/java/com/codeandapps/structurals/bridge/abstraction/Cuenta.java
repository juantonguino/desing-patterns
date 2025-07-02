package com.codeandapps.structurals.bridge.abstraction;

import com.codeandapps.structurals.bridge.impls.Banco;

public abstract class Cuenta {
    protected Banco banco;

    public Cuenta(Banco banco) {
        this.banco = banco;
    }

    public abstract void mostrarTipoCuenta();
}