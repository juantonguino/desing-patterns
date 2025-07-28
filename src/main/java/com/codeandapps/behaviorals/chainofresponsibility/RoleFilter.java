package com.codeandapps.behaviorals.chainofresponsibility;

public class RoleFilter extends HttpFilter{

    private final String requiredRole;

    public RoleFilter(String requiredRole) {
        this.requiredRole = requiredRole;
    }

    @Override
    protected void handle(HttpRequest request) {
        String userRole = request.getHeaders().get("Role"); // Simulación

        if (requiredRole.equals(userRole)) {
            System.out.println("RoleFilter: Acceso concedido para el rol: " + requiredRole);
            next(request);
        } else {
            System.out.println("RoleFilter: Acceso denegado. Rol requerido: " + requiredRole + ", pero se recibió: " + userRole);
        }
    }
}
