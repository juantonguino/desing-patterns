package com.codeandapps.behaviorals.chainofresponsibility;

public class AuthFilter extends HttpFilter{

    @Override
    protected void handle(HttpRequest request) {
        String token = request.getHeaders().get("Authorization");
        if ("Bearer valid-token".equals(token)) {
            request.setAttribute("user", "adminUser");
            System.out.println("AuthFilter: usuario autenticado");
            next(request);
        } else {
            System.out.println("AuthFilter: token inválido. Cortando cadena.");
        }
    }
}
