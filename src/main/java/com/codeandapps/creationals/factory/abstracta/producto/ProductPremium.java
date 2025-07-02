package com.codeandapps.creationals.factory.abstracta.producto;

public class ProductPremium {

    public record PremiumHamburger() implements IProduct.Hamburger {
        @Override
        public String getDescription() {
            return "Hamburguesa Premium con ingredientes de alta calidad";
        }
    }

    public record PremiumPotato() implements IProduct.Potato {
        @Override
        public String getDescription() {
            return "Papa frita Premium con un toque especial: ";
        }
    }

    public record PremiumDrink() implements IProduct.Drink {
        @Override
        public String getDescription() {
            return "Bebida Premium con sabores exclusivos";
        }
    }
}
