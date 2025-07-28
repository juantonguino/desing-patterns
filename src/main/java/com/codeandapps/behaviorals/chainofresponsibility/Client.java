package com.codeandapps.behaviorals.chainofresponsibility;

import javax.management.relation.Role;
import java.util.Map;

public class Client {
    public static void main(String[] args) {
        HttpFilter filter1 = new AuthFilter();
        HttpFilter filter2 = new RoleFilter("admin");

        filter1.linkWith(filter2);

        // Simulación de una petición HTTP
        System.out.println("Simulación de una petición HTTP:");
        HttpRequest request = new HttpRequest();
        final var headers = Map.of(
                "Authorization", "Bearer valid-token",
                "Role", "admin");
        request.setHeaders(headers);
        request.setBody("body");
        filter1.handle(request);
        // Simulación fallida de una petición HTTP
        System.out.println("Simulación fallida de una petición HTTP:");
        HttpRequest request2 = new HttpRequest();
        final var headers2 = Map.of(
                "Authorization", "Bearer valid-token",
                "Role", "admin");
        request.setHeaders(headers2);
        request.setBody("body");
        filter1.handle(request2);
    }
}
