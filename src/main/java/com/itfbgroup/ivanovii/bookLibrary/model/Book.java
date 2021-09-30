package com.itfbgroup.ivanovii.bookLibrary.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

/**
 * @author Ivanov Ivan
 */
@Entity
@Table(name = "books")
@Data
public class Book {
    private @Id @GeneratedValue(strategy = GenerationType.IDENTITY) Long id;
    private String book_name;
    private Integer isbn;
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "book_author",
        joinColumns =  @JoinColumn(name = "book_id"),
        inverseJoinColumns = @JoinColumn(name = "author_id"))
    private List<Author> authors;
}
