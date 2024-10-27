package com.example.demo.service;

import com.example.demo.models.Libros;
import com.example.demo.repository.LibrosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.time.LocalDate;

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
        System.out.println(libro);
    }
}
