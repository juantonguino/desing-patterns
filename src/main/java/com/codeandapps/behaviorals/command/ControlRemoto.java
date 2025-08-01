package com.codeandapps.behaviorals.command;

import java.util.Stack;
import java.util.logging.Logger;

public class ControlRemoto {

    private static final Logger LOGGER = Logger.getLogger(ControlRemoto.class.getName());

    private Command comando;
    private Stack<Command> historial;

    public ControlRemoto() {
        historial = new Stack<>();
    }

    public void setComando(Command comando) {
        this.comando = comando;
    }

    public void presionarBoton() {
        if (comando != null) {
            comando.execute();
            historial.push(comando);
        }
    }

    public void presionarUndo() {
        if (!historial.isEmpty()) {
            Command ultimo = historial.pop();
            ultimo.undo();
        } else {
            LOGGER.info("No hay comandos para deshacer.");
        }
    }
}
