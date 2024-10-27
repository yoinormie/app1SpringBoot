package com.example.demo.excepciones;

public class ISBNIncorrecto extends Exception{
    String causa;
public ISBNIncorrecto(String causa){
    this.causa = causa;
}

}
