package com.example.demo.service;

import com.example.demo.models.Libros;
import org.springframework.stereotype.Service;

import java.sql.Date;

@Service
public class LibroService {

public Libros mostrarCoso(){
    return new Libros(0,"wawa", Date.valueOf("2024-10-20"),"xd");
}
}
