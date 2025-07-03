package com.codeandapps.structurals.proxy;

public class DocumentoSecreto implements Documento{

    private final String contenido;

    public DocumentoSecreto(String contenido){
        this.contenido= contenido;
    }


    @Override
    public String  mostrar() {
        return contenido;
    }
}
