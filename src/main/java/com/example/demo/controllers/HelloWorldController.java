package com.example.demo.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController
public class HelloWorldController {

    @RequestMapping("/")
    public String index() {
        return "<h1> blablabla </h1>";
    }
    @RequestMapping("/test")
    public String index2() {
        return "Hello World! TEST";
    }
    @RequestMapping("/hej")
    public String hej(@RequestParam (required = false) String name) {
        if (name == null) return "Hello world";
        return "Hello " + name;
    }

    @RequestMapping("/hej2")
    public String hej2(@RequestParam (defaultValue = "Nick") String firstname,
                       @RequestParam (defaultValue = "Danielsson") String lastname) {
        return "Hello " + firstname + " " + lastname;
    }
    @RequestMapping("/hej3")
    public String hej3(@RequestParam List<String> names){
        return "Hello " + names;
    }
    @RequestMapping("/hejPathParam/{name}")
    public String hejPathParam(@PathVariable String name) {
        if (name == null) return "Hello world";
        return "Hello " + name;
    }

    @RequestMapping("/hejHTML")
    public String hejHTML() {
        return "<h1>Hej</h1>";
    }
}
