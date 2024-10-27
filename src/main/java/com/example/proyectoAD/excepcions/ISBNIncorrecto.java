package com.example.proyectoAD.excepcions;

public class ISBNIncorrecto extends RuntimeException{
    String causa;
public ISBNIncorrecto(String causa){
    this.causa = causa;
}

}
