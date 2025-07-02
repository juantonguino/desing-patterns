package com.codeandapps.creationals.builder.record;

public class Client {
    public static void main(String[] args) {
        UserRecord user = UserRecord.UserBuilder()
                .nombre("John Doe")
                .edad(30)
                .email("juan.tonguino@gmail.com")
                .build();
        StringBuilder sb = new StringBuilder();
        sb.append("type: ").append(user.toString()).append("Nombre: ").append(user.nombre())
          .append(", Edad: ").append(user.Edad())
          .append(", Email: ").append(user.email());
        System.out.println(sb);
    }
}
