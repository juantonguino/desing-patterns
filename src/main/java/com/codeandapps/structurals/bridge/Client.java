package com.codeandapps.structurals.bridge;
import com.codeandapps.structurals.bridge.abstraction.*;
import com.codeandapps.structurals.bridge.impls.*;

public class Client {
    public static void main(String[] args) {
        // Crear una cuenta de ahorro en Banco A
        Cuenta cuentaAhorroBancoA = new CuentaAhorro(new BancoA());
        cuentaAhorroBancoA.mostrarTipoCuenta();

        // Crear una cuenta corriente en Banco B
        Cuenta cuentaCorrienteBancoB = new CuentaCorriente(new BancoB());
        cuentaCorrienteBancoB.mostrarTipoCuenta();
    }
}
