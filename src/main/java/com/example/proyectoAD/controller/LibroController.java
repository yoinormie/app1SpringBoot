package com.example.proyectoAD.controller;


import com.example.proyectoAD.models.Libros;
import com.example.proyectoAD.services.LibroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
public class LibroController {
    private final LibroService libroService;

    @Autowired
    public LibroController(LibroService libroService){
        this.libroService = libroService;
    }

    @GetMapping("/api/v1/libro1")
    public Libros mostrarTodo(){
        return libroService.mostrarCoso();
    }

    @ResponseStatus()
    @PostMapping( path = "/api/v1/registro", consumes = MediaType.APPLICATION_JSON_VALUE)
    public void insertLibro(@RequestBody Libros libro){
        libroService.addingNewLibros(libro);
    }
}
