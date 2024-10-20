package com.example.demo.models;

import jakarta.persistence.*;

import java.sql.Date;

@Entity
@Table
public class Libros {
    @Id
    @SequenceGenerator(
            name = "libros_sequence",
            sequenceName = "libros_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "libros_sequence"
    )
    int id;
    String nombre;
    Date fecha;
    String autor;

    public Libros() {
    }

    public Libros(int id, String nombre, Date fecha, String autor) {
        this.id = id;
        this.nombre = nombre;
        this.fecha = fecha;
        this.autor = autor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
}
