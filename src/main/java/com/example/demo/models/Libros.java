package com.example.demo.models;

import jakarta.persistence.*;

import java.sql.Date;

@Entity
@Table(name = "libros")
public class Libros {

    @Id
    String ISBN;

    @Column(nullable = false)
    String name;
    @Column(nullable = false)
    Date insertionDate;
    @Column(nullable = false)
    Date lastModification;
    @Column(nullable = false)
    String author;
    //@Column(nullable = false)
    int timesRead;


    public Libros() {
    }

    public Libros(String ISBN, String name, Date insertionDate, String author, Date lastModification, int timesRead) {
        this.ISBN = ISBN;
        this.name = name;
        this.insertionDate = insertionDate;
        this.author = author;
        this.lastModification = lastModification;
        this.timesRead = timesRead;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public Date getInsertionDate() {
        return insertionDate;
    }

    public void setInsertionDate(Date insertionDate) {
        this.insertionDate = insertionDate;
    }

    public Date getLastModification() {
        return lastModification;
    }

    public void setLastModification(Date lastModification) {
        this.lastModification = lastModification;
    }

    public int getTimesRead() {
        return timesRead;
    }

    public void setTimesRead(int timesRead) {
        this.timesRead = timesRead;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Libros{" +
                "ISBN='" + ISBN + '\'' +
                ", name='" + name + '\'' +
                ", insertionDate=" + insertionDate +
                ", lastModification=" + lastModification +
                ", author='" + author + '\'' +
                ", timesRead=" + timesRead +
                '}';
    }
}
