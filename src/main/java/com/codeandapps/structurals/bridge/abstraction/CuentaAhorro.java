package com.codeandapps.structurals.bridge.abstraction;

import com.codeandapps.structurals.bridge.impls.Banco;

public class CuentaAhorro extends Cuenta {
    private static final double INTERES = 0.02; // 2% de interés

    public CuentaAhorro(Banco banco, double saldoInicial) {
        super(banco, saldoInicial);
    }

    @Override
    public void retirar(double monto) {
        if (monto <= saldo) {
            saldo -= monto;
            banco.realizarTransaccion(monto, "Retiro de cuenta de ahorro");
        } else {
            System.out.println("Saldo insuficiente en cuenta de ahorro");
        }
    }

    @Override
    public void depositar(double monto) {
        double montoConInteres = monto * (1 + INTERES);
        saldo += montoConInteres;
        banco.realizarTransaccion(montoConInteres, "Depósito en cuenta de ahorro (con interés)");
    }

    @Override
    public void mostrarTipoCuenta() {
        System.out.print("Cuenta de Ahorro en ");
        banco.mostrarBanco();
    }
}