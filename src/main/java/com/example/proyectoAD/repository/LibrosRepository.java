package com.example.proyectoAD.repository;

import com.example.proyectoAD.models.Libros;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.sql.Date;
import java.util.Optional;

@Repository
public interface LibrosRepository extends JpaRepository <Libros, String> {

    Optional<Libros> findLibro(String ISBN);
    @Query("SELECT l FROM Libros l WHERE l.name = ?1")
    Optional<Libros> findByname(String name);
    @Query("SELECT l FROM Libros l WHERE l.author = ?1")
    Optional<Libros> findByAuthor(String author);
    @Query("SELECT l FROM Libros l")
    Optional<Libros> showAll();
    @Query("SELECT l FROM Libros l WHERE l.insertion_date = ?1")
    Optional<Libros> findLibrobyInsertDate(Date date);
}
