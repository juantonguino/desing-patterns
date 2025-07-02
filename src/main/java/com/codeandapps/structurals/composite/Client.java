package com.codeandapps.structurals.composite;

public class Client {
    public static void main(String[] args) {
        ComponentUI textoLeaft1 = new TextoLeaft("Texto 1");
        ComponentUICompose fragment= new FragmentBranch("Fragment 1");
        fragment.add(textoLeaft1);
        ComponentUICompose activity = new ActivityBranch("Activity 2");
        activity.add(fragment);

        activity.render();
    }
}
