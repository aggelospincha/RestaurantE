package com.example.restaurante.Models;

public class Reservations {
    private String name;
    private String Phone;
    private String time;
    private String resnumber;
    private String table;
    private String Date;

    public Reservations(String name, String phone, String date, String table, String hours){

    }

   public Reservations(String name,String Phone,String resnumber,String time , String table,String Date){

        this.name=name;
        this.Phone=Phone;
        this.Date=Date;
        this.resnumber=resnumber;
        this.time=time;
        this.table=table;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getResnumber() {
        return resnumber;
    }

    public void setResnumber(String resnumber) {
        this.resnumber = resnumber;
    }

    public String getTime() {
        return time;
    }

    public  void setTime(String time) {this.time=time; }

    public String getTable() {
        return table;
    }

    public void setTable(String table) {
        this.table = table;
    }
}
