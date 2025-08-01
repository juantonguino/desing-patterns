package com.codeandapps.behaviorals.command;

public interface Command {
    void execute();
    void undo();
}