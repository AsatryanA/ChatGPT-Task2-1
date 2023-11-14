package com.epam.chatgpt_task21.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

// Genre.java
@Entity
@Data
public class Genre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToMany(mappedBy = "genre")
    private List<Book> books;
}
