package com.example.restaurante.Models;

public class Products {

    private String nameProduct;
    private double timi;


    public Products(){}


    public Products(String name ,double timi){

        this.nameProduct=name;
        this.timi=timi;

    }


    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public double getTimi() {
        return timi;
    }

    public void setTimi(double timi) {
        this.timi = timi;
    }
}
