package com.example.demo.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@RestController
public class LuckyYouController {
    @RequestMapping("/ovning")
    public String test(@RequestParam String luckyYou){
        Random rand = new Random();
        List<String> list = new ArrayList<>();
        list.add("Hund");
        list.add("Katt");
        list.add("Fågel");
        list.add("Fisk");
        int x = rand.nextInt(10) +1;
        String y = String.valueOf(x);
        if (luckyYou.equals("number")) return y;
        if (luckyYou.equals("animal")) {
            int a = rand.nextInt(3)+1;
            return list.get(a);
        }
        return "Defualt";
    }
}
