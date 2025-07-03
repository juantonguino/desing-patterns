package com.codeandapps.structurals.bridge.impls;

public class BancoA implements Banco {
    @Override
    public void realizarTransaccion(double monto, String tipo) {
        System.out.println("Banco A - " + tipo + " por $" + monto);
    }

    @Override
    public void mostrarSaldo(double saldo) {
        System.out.println("Banco A - Saldo actual: $" + saldo);
    }

    @Override
    public void mostrarBanco() {
        System.out.println("Banco A");
    }
}