package com.codeandapps.creationals.builder.classes;

public class Client {

    public static void main(String[] args) {
        User user = User.builder()
                .nombre("John Doe")
                .edad(30)
                .email("").build();
        System.out.println(user);
    }
}
