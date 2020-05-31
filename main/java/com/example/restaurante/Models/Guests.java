package com.example.restaurante.Models;

public class Guests {
    private String name;
   private  String resnumber;
   private String phone;


    public Guests (){}

    public Guests (String name , String resnumber, String phone){

        this.phone=phone;
        this.name=name;
        this.resnumber=resnumber;

    }

    public String getResnumber() {
        return resnumber;
    }

    public void setResnumber(String resnumber) {
        this.resnumber = resnumber;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
