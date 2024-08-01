package com.github.b1tterman.spring.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
//@Table(name = "book")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String author;
    private String name;

}
