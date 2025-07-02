package com.codeandapps.creationals.factory.abstracta;

import com.codeandapps.creationals.factory.abstracta.factorys.Factories;
import com.codeandapps.creationals.factory.abstracta.factorys.IFactoryCombo;
import com.codeandapps.creationals.factory.abstracta.producto.IProduct;

public class Restaurant {

    private IFactoryCombo factoryComboPremium;

    private IFactoryCombo factoryComboJunior;

    public Restaurant() {
        factoryComboJunior = new Factories.ComboJunior();
        factoryComboPremium = new Factories.ComboPremium();
    }

    public void orderComboPremium() {
        StringBuilder builderResult = new StringBuilder();
        builderResult.append("🌟");
        orderCombo(factoryComboPremium, builderResult);
    }

    public void orderComboJunior() {
        StringBuilder builderResult = new StringBuilder();
        builderResult.append("🚂");
        orderCombo(factoryComboJunior,builderResult);
    }
    public void orderCombo(IFactoryCombo factoryCombo, StringBuilder builderResult) {
        IProduct.Hamburger hamburger= factoryCombo.getHamburger();
        IProduct.Potato potato = factoryCombo.getPotato();
        IProduct.Drink drink = factoryCombo.getDrink();

        builderResult.append("Order Combo: ").append(factoryCombo.getClass().getSimpleName())
                .append("\n").append(hamburger.getDescription())
                .append("\n").append(potato.getDescription())
                .append("\n").append(drink.getDescription());

        System.out.println(builderResult);
    }

}
