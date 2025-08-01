package com.codeandapps.behaviorals.command;

import java.util.logging.Logger;

public class Televisor {

    public final static Logger LOGGER = Logger.getLogger(Televisor.class.getName());

    private int volumen;

    public void subirVolumen() {
        if (volumen < 100) {
            volumen++;
            LOGGER.info("Volumen subido a: " + volumen);
        } else {
            LOGGER.info("El volumen ya está al máximo");
        }
    }

    public void bajarVolumen() {
        if (volumen > 0) {
            volumen--;
            LOGGER.info("Volumen bajado a: " + volumen);
        } else {
            LOGGER.info("El volumen ya está al mínimo");
        }
    }
}
