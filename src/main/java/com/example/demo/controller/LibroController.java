package com.example.demo.controller;


import com.example.demo.service.LibroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LibroController {
    private final LibroService libroService;

    @Autowired
    public LibroController(LibroService libroService){
        this.libroService = libroService;
    }

    @GetMapping("/api/v1/libro1")
    public String mostrarTitulo(){
        return libroService.mostrarCoso().getNombre();
    }
}
