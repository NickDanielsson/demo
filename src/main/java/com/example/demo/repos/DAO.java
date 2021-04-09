package com.example.demo.repos;

import com.example.demo.models.Kompis;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DAO {

    Kompis k1 = new Kompis(1,"Tobbe","Siklöjevägen","123");
    Kompis k2 = new Kompis(2,"Pavel","Mariatorget","456");
    Kompis k3 = new Kompis(3,"Magnus","Warsava","789");

    List<Kompis> list = new ArrayList<>();

    public List<Kompis> getKompisList() {
        list.add(k1);
        list.add(k2);
        list.add(k3);
        return list;
    }
}
