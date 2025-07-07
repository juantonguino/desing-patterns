package com.codeandapps.structurals.facade;

import java.util.function.Consumer;

public class Proyector {
    private State state;
    private Consumer<State> action;

    public Proyector() {
        action = this::setActionConsumer;
    }

    private void setActionConsumer(State state) {
        this.state = state;
        System.out.println("Proyector " + state.getState());
    }

    public Consumer<State> getAction() {
        return action;
    }
}
