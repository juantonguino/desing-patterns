package com.codeandapps.creationals.factory.simple;

public class Cliente {

    public static void main(String[] args) {
        FormaFactory factory = new FormaFactory();
        Forma formaCuadrado=factory.getForma(FormaType.CUADRADO);
        formaCuadrado.dibujar();
        Forma formaCirculo=factory.getForma(FormaType.CIRCULO);
        formaCirculo.dibujar();
    }
}
