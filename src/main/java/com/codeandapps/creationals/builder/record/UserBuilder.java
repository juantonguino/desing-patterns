package com.codeandapps.creationals.builder.record;

public class UserBuilder {

    private String nombre;
    private int edad;
    private String email;

    public UserBuilder nombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public UserBuilder edad(int edad) {
        this.edad = edad;
        return this;
    }

    public UserBuilder email(String email) {
        this.email = email;
        return this;
    }

    public UserRecord build() {
        return new UserRecord(nombre, edad, email);
    }
}