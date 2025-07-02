package com.codeandapps.creationals.factory.abstracta.producto;

import java.util.IllegalFormatCodePointException;

public class ProductJunior {

    public record JuniorHamburger() implements IProduct.Hamburger {
        @Override
        public String getDescription() {
            return "Hamburguesa Junior con ingredientes básicos";
        }
    }

    public record JuniorPotato() implements IProduct.Potato {
        @Override
        public String getDescription() {
            return "Papa frita Junior con un toque simple";
        }
    }
    public record JuniorDrink() implements IProduct.Drink {
        @Override
        public String getDescription() {
            return "Bebida Junior con sabores comunes";
        }
    }
}
