package com.example.proyectoAD.repository;

import com.example.proyectoAD.models.Libros;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.sql.Date;
import java.util.List;
import java.util.Optional;

@Repository
public interface LibrosRepository extends JpaRepository <Libros, String> {

    Optional<Libros> findByISBN(String ISBN);
    List<Libros> findByname(String name);
    List<Libros> findByauthor(String author);
    List<Libros> findByinsertionDate(Date insertionDate);

}
