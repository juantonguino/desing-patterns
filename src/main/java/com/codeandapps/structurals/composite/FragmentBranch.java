package com.codeandapps.structurals.composite;

import java.util.ArrayList;
import java.util.List;

public class FragmentBranch implements ComponentUICompose{
    private String name;
    private List<ComponentUI> components;

    public FragmentBranch(String name) {
        this.name = name;
        this.components = new ArrayList<>();
    }

    @Override
    public void render() {
        System.out.println("Rendering fragment: " + name);
        components.stream().forEach(ComponentUI::render);
    }

    @Override
    public void add(ComponentUI component) {
        components.add(component);
    }
}
