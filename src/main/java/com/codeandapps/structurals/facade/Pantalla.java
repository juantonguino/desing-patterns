package com.codeandapps.structurals.facade;

import java.util.function.Consumer;

public class Pantalla {
    private State state;
    private Consumer<State> action;

    public Pantalla() {
        action = this::setActionConsumer;
    }

    private void setActionConsumer(State state) {
        this.state = state;
        System.out.println("Pantalla " + state.getState());
    }

    public Consumer<State> getAction() {
        return action;
    }
}
