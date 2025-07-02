package com.codeandapps.creationals.builder.record;

public record UserRecord(String nombre, int Edad, String email) {

    public static UserBuilder UserBuilder() {
        return new UserBuilder();
    }
}
