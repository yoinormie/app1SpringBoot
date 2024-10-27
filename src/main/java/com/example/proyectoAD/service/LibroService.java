package com.example.proyectoAD.service;

import com.example.proyectoAD.excepciones.ISBNIncorrecto;
import com.example.proyectoAD.models.Libros;
import com.example.proyectoAD.repository.LibrosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.time.LocalDate;
import java.util.Optional;

@Service
public class LibroService {

    LibrosRepository librosRepository;

    @Autowired
    public LibroService(LibrosRepository librosRepository){
        this.librosRepository = librosRepository;
    }

public Libros mostrarCoso(){
    return new Libros("ISBN","name", Date.valueOf(LocalDate.now()),"wawa",Date.valueOf(LocalDate.now()),0);
   // return null;
}

    public void addingNewLibros(Libros libro){
        if(librosRepository.findLibro(libro.getISBN()).equals("wawa")){
            throw new ISBNIncorrecto("wawa");
        }
        System.out.println(libro);
    }
}
