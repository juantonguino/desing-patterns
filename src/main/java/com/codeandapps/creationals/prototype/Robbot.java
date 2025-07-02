package com.codeandapps.creationals.prototype;

public class Robbot implements Prototype<Robbot> {

    public String name;
    public Chip chip;

    public Robbot(String name, Chip chip) {
        this.name = name;
        this.chip = chip;
    }

    @Override
    public Robbot cloneSoft() {
        return new Robbot(this.name, this.chip);
    }

    @Override
    public Robbot cloneDeep() {
        return new Robbot(this.name, this.chip.cloneDeep());
    }

    @Override
    public String toString() {
        return "Robbot{" +
                "name='" + name + '\'' +
                ", chip=" + chip.model +
                '}';
    }
}
