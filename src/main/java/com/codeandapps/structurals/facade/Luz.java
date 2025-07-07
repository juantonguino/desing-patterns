package com.codeandapps.structurals.facade;

import java.util.function.Consumer;

public class Luz {
    private State state;
    private Consumer<State> action;

    public Luz() {
        action = this::setActionConsumer;
    }

    private void setActionConsumer(State state) {
        this.state = state;
        System.out.println("Luz " + state.getState());
    }

    public Consumer<State> getAction() {
        return action;
    }
}
