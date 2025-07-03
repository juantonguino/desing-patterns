package com.codeandapps.structurals.proxy;

import java.util.List;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class DocumentoProxy implements  Documento{

    private final static List<String> USUARIOS = List.of("admin", "user1", "user2");

    private DocumentoSecreto documentoSecreto;
    private String usuario;

    public DocumentoProxy(String usuario) {
        this.usuario = usuario;

    }

    public boolean validarUsuario() {
        Predicate<String> funcValidateUser= (usuario)-> USUARIOS.contains(usuario);
        return funcValidateUser.test(usuario);
    }

    @Override
    public String  mostrar() {
        Supplier<String> supplierMostrarUsuario= ()-> new DocumentoSecreto("Documento secreto para el usuario: " + usuario).mostrar();
        return (validarUsuario())? supplierMostrarUsuario.get():"Acceso denegado. Clave incorrecta.";
    }
}
