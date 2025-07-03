package com.codeandapps.structurals.bridge.abstraction;

import com.codeandapps.structurals.bridge.impls.Banco;

public class CuentaCorriente extends Cuenta {
    private static final double SOBREGIRO_MAXIMO = 1000.0;

    public CuentaCorriente(Banco banco, double saldoInicial) {
        super(banco, saldoInicial);
    }

    @Override
    public void retirar(double monto) {
        if (saldo + SOBREGIRO_MAXIMO >= monto) {
            saldo -= monto;
            banco.realizarTransaccion(monto, "Retiro de cuenta corriente");
        } else {
            System.out.println("Excede el límite de sobregiro permitido");
        }
    }

    @Override
    public void depositar(double monto) {
        saldo += monto;
        banco.realizarTransaccion(monto, "Depósito en cuenta corriente");
    }

    @Override
    public void mostrarTipoCuenta() {
        System.out.print("Cuenta Corriente en ");
        banco.mostrarBanco();
    }
}