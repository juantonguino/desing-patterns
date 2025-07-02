package com.codeandapps.creationals.factory.abstracta.factorys;

import com.codeandapps.creationals.factory.abstracta.producto.IProduct;
import com.codeandapps.creationals.factory.abstracta.producto.ProductJunior;
import com.codeandapps.creationals.factory.abstracta.producto.ProductPremium;

public class Factories {

    public record ComboPremium() implements IFactoryCombo{


        @Override
        public IProduct.Hamburger getHamburger() {
            return new ProductPremium.PremiumHamburger();
        }

        @Override
        public IProduct.Potato getPotato() {
            return new ProductPremium.PremiumPotato();
        }

        @Override
        public IProduct.Drink getDrink() {
            return new ProductPremium.PremiumDrink();
        }
    }

    public record ComboJunior() implements IFactoryCombo {

        @Override
        public IProduct.Hamburger getHamburger() {
            return new ProductJunior.JuniorHamburger();
        }

        @Override
        public IProduct.Potato getPotato() {
            return new ProductJunior.JuniorPotato();
        }

        @Override
        public IProduct.Drink getDrink() {
            return new ProductJunior.JuniorDrink();
        }
    }
}
