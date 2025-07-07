package com.codeandapps.structurals.facade;

public enum State {

    ENCENDER("Encendido"),
    APAGAR("Apagado");

    private final String state;

    private State(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
