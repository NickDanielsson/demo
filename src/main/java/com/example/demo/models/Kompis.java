package com.example.demo.models;

public class Kompis {
    protected int id;
    protected String name;
    protected String adress;
    protected String phoneNr;

    public Kompis(){}

    public Kompis(int id, String name, String adress, String phoneNr) {
        this.id = id;
        this.name = name;
        this.adress = adress;
        this.phoneNr = phoneNr;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getPhoneNr() {
        return phoneNr;
    }

    public void setPhoneNr(String phoneNr) {
        this.phoneNr = phoneNr;
    }


}
