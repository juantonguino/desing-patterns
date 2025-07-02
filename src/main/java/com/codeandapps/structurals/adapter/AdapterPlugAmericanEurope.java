package com.codeandapps.structurals.adapter;

public class AdapterPlugAmericanEurope implements AmericanPlug{

    private final EuropePlug europePlug;

    public AdapterPlugAmericanEurope(EuropePlug europePlug) {
        this.europePlug = europePlug;
    }

    @Override
    public void conect() {
        europePlug.connect();
    }
}
