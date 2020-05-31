package com.example.restaurante.Models;

public class DrinksM  extends  Products{

    public DrinksM(String name, double timi) {
        super(name, timi);
    }


    public String getName() {

        return super.getNameProduct();
    }

    public double  getTimi(){

        return super.getTimi();

    }
}
