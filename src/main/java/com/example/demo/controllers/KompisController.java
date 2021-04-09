package com.example.demo.controllers;

import com.example.demo.models.Kompis;
import com.example.demo.repos.DAO;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class KompisController {
    DAO db = new DAO();
    List<Kompis> list = db.getKompisList();
    @RequestMapping("/kompisar")
    public List<Kompis> kompisar(){
        return list;
    }

    // LinkedList och ArrayList skiljer sig åt på metoder

    @RequestMapping("/kompisar/{id}")
    public Kompis kompisById(@PathVariable int id){
       // Kompis k = new Kompis();
        for (Kompis x : list){
            if(x.getId() == id) {
                return x;
            }
        }
        return null;
    }
    /*
    @RequestMapping("/kompisarnamenr")
    public List<Kompis> kompisNameAndNumber(){

    }*/
    @PostMapping("/kompisar/add")
    public String addKompis(@RequestBody Kompis k){
            list.add(k);
            return "Kompis " + k.getName() + " Lades till";
    }

    @PostMapping("/kompisar/upsert")
    public String updateKompis(@RequestBody Kompis k){
        int kompisId = -1;

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == k.getId()) {
                kompisId = i;
            }
        }
            if (kompisId == -1){

                list.add(k);
                return "Kompis med id " + k.getId() + " lades till";
            }
            else {
                list.set(kompisId,k);
                return "kompis uppdaterades";
            }


    }
}
