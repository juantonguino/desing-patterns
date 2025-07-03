package com.codeandapps.structurals.bridge.abstraction;

import com.codeandapps.structurals.bridge.impls.Banco;

public abstract class Cuenta {
    protected Banco banco;
    protected double saldo;

    public Cuenta(Banco banco, double saldoInicial) {
        this.banco = banco;
        this.saldo = saldoInicial;
    }

    public abstract void retirar(double monto);
    public abstract void depositar(double monto);

    public void consultarSaldo() {
        banco.mostrarSaldo(saldo);
    }

    public void mostrarTipoCuenta() {
        banco.mostrarBanco();
    }
}