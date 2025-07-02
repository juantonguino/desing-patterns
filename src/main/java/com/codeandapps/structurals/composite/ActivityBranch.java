package com.codeandapps.structurals.composite;

import java.util.ArrayList;
import java.util.List;

public class ActivityBranch implements ComponentUICompose{
    private String name;
    private List<ComponentUI> components;

    public ActivityBranch(String name) {
        this.name = name;
        this.components= new ArrayList<>();
    }

    @Override
    public void render() {
        System.out.println("Activity: " + name);
        components.stream().forEach(ComponentUI::render);
    }

    @Override
    public void add(ComponentUI component) {
        components.add(component);
    }
}
