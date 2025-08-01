package com.codeandapps.behaviorals.command;

public class Client {
    public static void main(String[] args) {
        Televisor televisor = new Televisor();

        Command subirVolumen = new SubirVolumenCommand(televisor);
        Command bajarVolumen = new BajarVolumenCommand(televisor);

        ControlRemoto controlRemoto = new ControlRemoto();

        // Subir volumen
        controlRemoto.setComando(subirVolumen);
        controlRemoto.presionarBoton();

        // Bajar volumen
        controlRemoto.setComando(bajarVolumen);
        controlRemoto.presionarBoton();

        // Deshacer la última acción (bajar volumen)
        controlRemoto.presionarUndo();
    }
}
