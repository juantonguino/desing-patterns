package com.codeandapps.structurals.bridge.abstraction;

import com.codeandapps.structurals.bridge.impls.Banco;

public class CuentaAhorro extends Cuenta {
    public CuentaAhorro(Banco banco) {
        super(banco);
    }

    @Override
    public void mostrarTipoCuenta() {
        System.out.print("Cuenta de Ahorro en ");
        banco.mostrarBanco();
    }
}