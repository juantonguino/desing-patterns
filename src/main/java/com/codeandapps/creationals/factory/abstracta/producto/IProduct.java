package com.codeandapps.creationals.factory.abstracta.producto;

public interface IProduct {

    interface Hamburger {
        String getDescription();
    }

    interface Potato {
        String getDescription();
    }

    interface Drink {
        String getDescription();
    }
}