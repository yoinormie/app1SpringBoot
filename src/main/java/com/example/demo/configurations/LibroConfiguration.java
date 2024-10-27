package com.example.demo.configurations;

import com.example.demo.models.Libros;
import com.example.demo.repository.LibrosRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

@Configuration
public class LibroConfiguration {

    @Bean
    CommandLineRunner commandLineRunner(LibrosRepository repository){
        return args -> {
            Libros l1 = new Libros(
                    "wawa",
                    "a",
                    Date.valueOf(LocalDate.now()),
                    "w",
                    Date.valueOf(LocalDate.now()),
                    0
            );
            Libros l2 = new Libros(
                    "wawa2",
                    "a",
                    Date.valueOf(LocalDate.now()),
                    "w",
                    Date.valueOf(LocalDate.now()),
                    0
            );
            repository.saveAll(List.of(l1,l2));
        };

    }
}
