package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class pruebaControler {

    @GetMapping("/api/v1/hola")
    public String hola(){
        return "hola";
    }
}
