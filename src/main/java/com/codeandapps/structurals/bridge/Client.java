package com.codeandapps.structurals.bridge;

import com.codeandapps.structurals.bridge.abstraction.*;
import com.codeandapps.structurals.bridge.impls.*;

public class Client {
    public static void main(String[] args) {
        // Creamos instancias de los bancos
        Banco bancoA = new BancoA();
        Banco bancoB = new BancoB();

        // Creamos diferentes tipos de cuentas en diferentes bancos
        System.out.println("=== Cuenta de Ahorro en Banco A ===");
        Cuenta ahorroEnBancoA = new CuentaAhorro(bancoA, 1000);
        ahorroEnBancoA.mostrarTipoCuenta();
        ahorroEnBancoA.consultarSaldo();
        ahorroEnBancoA.depositar(500);  // Se aplicará interés
        ahorroEnBancoA.retirar(200);
        ahorroEnBancoA.consultarSaldo();

        System.out.println("\n=== Cuenta Corriente en Banco B ===");
        Cuenta corrienteEnBancoB = new CuentaCorriente(bancoB, 2000);
        corrienteEnBancoB.mostrarTipoCuenta();
        corrienteEnBancoB.consultarSaldo();
        corrienteEnBancoB.depositar(1000);
        corrienteEnBancoB.retirar(2500);  // Permitirá sobregiro
        corrienteEnBancoB.consultarSaldo();

        // Demostración de límites
        System.out.println("\n=== Pruebas de límites ===");
        ahorroEnBancoA.retirar(2000);     // Debería fallar por saldo insuficiente
        corrienteEnBancoB.retirar(3000);  // Debería fallar por exceder el sobregiro
    }
}
