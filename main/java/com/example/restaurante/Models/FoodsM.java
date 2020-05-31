package com.example.restaurante.Models;

public class FoodsM extends  Products {


    public FoodsM(String name, double timi) {
        super(name, timi);
    }


    public String getName() {

        return super.getNameProduct();
    }

    public double  getTimi(){

        return super.getTimi();

    }
}
