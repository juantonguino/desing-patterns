package com.codeandapps.creationals.prototype;

public class Chip implements Prototype <Chip>{

    public String model;

    Chip(String modelo){
        this.model = modelo;
    }
    @Override
    public Chip cloneSoft() {
        return new Chip(this.model);
    }

    @Override
    public Chip cloneDeep() {
        return new Chip(this.model);
    }
}
