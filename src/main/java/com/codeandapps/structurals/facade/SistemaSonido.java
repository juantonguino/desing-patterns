package com.codeandapps.structurals.facade;

import java.util.function.Consumer;

public class SistemaSonido {
    private State state;
    private Consumer<State> action;

    public SistemaSonido() {
        action = this::setActionConsumer;
    }

    private void setActionConsumer(State state) {
        this.state = state;
        System.out.println("Sistema Sonido " + state.getState());
    }

    public Consumer<State> getAction() {
        return action;
    }
}
