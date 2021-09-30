package com.itfbgroup.ivanovii.bookLibrary.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

/**
 * @author Ivanov Ivan
 */
@Entity
@Table(name= "author")
@Data
public class Author {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String first_name;
    private String lastName;
    private Date birth_date;
    @ManyToMany(fetch = FetchType.EAGER, mappedBy = "authors")
    @JsonIgnore
    private List<Book> books;
}
