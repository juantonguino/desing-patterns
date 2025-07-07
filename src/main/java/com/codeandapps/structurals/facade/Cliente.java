package com.codeandapps.structurals.facade;

public class Cliente {
    public static void main(String[] args) {
        CineFacade cineFacade= new CineFacade();
        cineFacade.encenderCine();
        cineFacade.correrPelicula();
        cineFacade.apagarCine();
    }
}
