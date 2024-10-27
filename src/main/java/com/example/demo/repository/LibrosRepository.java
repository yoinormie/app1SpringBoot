package com.example.demo.repository;

import com.example.demo.models.Libros;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Repository
public interface LibrosRepository extends JpaRepository <Libros, String> {

    Optional<Libros> findLibro(String ISBN);
    @Query("SELECT l FROM libros WHERE l")
    Optional<Libros> findByname(String name);
    Optional<Libros> findbyAuthor(String author);
    List<Libros> findAll();
    Optional<Libros> findLibrobyInsertDate(String date);
    Optional<Libros> findLibrobyInsertDate(LocalDate date);
    Optional<Libros> findLibrobyInsertDate(Date date);
}
