package com.codeandapps.creationals.factory.simple;

public class FormaFactory {

    public Forma getForma(FormaType type) {
        Forma result =switch (type) {
            case CIRCULO -> new Circulo();
            case CUADRADO -> new Cuadrado();
            default -> null;
        };
        return result;
    }
}
