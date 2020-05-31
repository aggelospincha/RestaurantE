package com.example.restaurante.Models;

public class DessertsM extends Products{
    public DessertsM(String name, double timi) {
        super(name, timi);
    }


    public String getName() {

        return super.getNameProduct();
    }

    public double  getTimi(){

        return super.getTimi();

    }
}
