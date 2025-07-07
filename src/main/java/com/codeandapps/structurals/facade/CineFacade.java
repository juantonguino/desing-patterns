package com.codeandapps.structurals.facade;

import java.util.function.Consumer;
import java.util.List;

public class CineFacade {

    private final Luz luz;
    private final Pantalla pantalla;
    private final Proyector proyector;
    private final SistemaSonido sistemaSonido;

    private final List<Consumer<State>> acciones;

    public CineFacade() {
        this.pantalla = new Pantalla();
        this.luz = new Luz();
        this.proyector = new Proyector();
        this.sistemaSonido = new SistemaSonido();
        acciones= List.of(
            pantalla.getAction(),
            luz.getAction(),
            proyector.getAction(),
            sistemaSonido.getAction()
        );
    }

    public void encenderCine() {
        acciones.forEach(action -> action.accept(State.ENCENDER));
    }

    public void correrPelicula() {
        System.out.println("Corriendo película...");
    }

    public void apagarCine() {
        acciones.forEach(action -> action.accept(State.APAGAR));
    }
}
