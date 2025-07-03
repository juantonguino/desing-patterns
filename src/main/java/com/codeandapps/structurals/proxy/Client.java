package com.codeandapps.structurals.proxy;

public class Client {
    public static void main(String[] args) {
        Documento documento = new DocumentoProxy("admin");
        System.out.println(documento.mostrar());
    }
}
