package com.codeandapps.structurals.bridge.impls;

public interface Banco {
    void realizarTransaccion(double monto, String tipo);
    void mostrarSaldo(double saldo);
    void mostrarBanco();
}