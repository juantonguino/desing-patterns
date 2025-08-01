package com.codeandapps.behaviorals.command;

public class SubirVolumenCommand implements Command{

    private Televisor televisor;

    public SubirVolumenCommand(Televisor televisor) {
        this.televisor = televisor;
    }

    @Override
    public void execute() {
        televisor.subirVolumen();
    }

    @Override
    public void undo() {
        televisor.bajarVolumen();
    }
}
