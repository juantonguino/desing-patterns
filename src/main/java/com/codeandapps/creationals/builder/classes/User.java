package com.codeandapps.creationals.builder.classes;

public class User {

    private String nombre;
    private int edad;
    private String email;

    public User(String nombre, int edad, String email) {
        this.nombre = nombre;
        this.edad = edad;
        this.email = email;
    }

    public static Builder builder(){
        return new Builder();
    }

    public static class Builder {

        private String nombre;
        private int edad;
        private String email;

        public Builder nombre(String nombre) {
            this.nombre = nombre;
            return this;
        }

        public Builder edad(int edad) {
            this.edad = edad;
            return this;
        }

        public Builder email(String email) {
            this.email = email;
            return this;
        }

        public User build() {
            return new User(nombre, edad, email);
        }
    }
}
