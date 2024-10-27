package com.example.proyectoAD.services;

import com.example.proyectoAD.excepcions.ISBNIncorrecto;
import com.example.proyectoAD.models.Libros;
import com.example.proyectoAD.repository.LibrosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;
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
        //Optional <Libros> librosOptional = librosRepository.findLibrosByISBN(libro.getISBN());
        List<Libros> libros = librosRepository.findByname("a");
        System.out.println(libros);
    }
}
