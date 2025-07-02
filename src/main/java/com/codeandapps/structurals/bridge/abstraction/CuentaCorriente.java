package com.codeandapps.structurals.bridge.abstraction;

import com.codeandapps.structurals.bridge.impls.Banco;

public class CuentaCorriente extends Cuenta {
    public CuentaCorriente(Banco banco) {
        super(banco);
    }

    @Override
    public void mostrarTipoCuenta() {
        System.out.print("Cuenta Corriente en ");
        banco.mostrarBanco();
    }
}