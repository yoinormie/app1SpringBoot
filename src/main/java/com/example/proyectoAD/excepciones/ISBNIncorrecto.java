package com.example.proyectoAD.excepciones;

public class ISBNIncorrecto extends RuntimeException{
    String causa;
public ISBNIncorrecto(String causa){
    this.causa = causa;
}

}
