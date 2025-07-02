package com.codeandapps.creationals.factory.abstracta.factorys;

import com.codeandapps.creationals.factory.abstracta.producto.IProduct;

public interface IFactoryCombo {

    IProduct.Hamburger getHamburger();

    IProduct.Potato getPotato();

    IProduct.Drink getDrink();
}
