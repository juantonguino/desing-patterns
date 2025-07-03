package com.codeandapps.structurals.bridge.impls;

public class BancoB implements Banco {
    @Override
    public void realizarTransaccion(double monto, String tipo) {
        System.out.println("Banco B - " + tipo + " por $" + monto + " (Comisión incluida)");
    }

    @Override
    public void mostrarSaldo(double saldo) {
        System.out.println("Banco B - Balance disponible: $" + saldo);
    }

    @Override
    public void mostrarBanco() {
        System.out.println("Banco B");
    }
}