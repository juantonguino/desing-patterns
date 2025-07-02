package com.codeandapps.structurals.composite;

public class TextoLeaft implements ComponentUI{
    private String texto;

    public TextoLeaft(String texto) {
        this.texto = texto;
    }

    @Override
    public void render() {
        System.out.println("Texto: " + texto);
    }
}
