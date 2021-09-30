package com.itfbgroup.ivanovii.bookLibrary.controller;

import com.itfbgroup.ivanovii.bookLibrary.exception.AuthorNotFoundException;
import com.itfbgroup.ivanovii.bookLibrary.model.Author;
import com.itfbgroup.ivanovii.bookLibrary.model.Book;
import com.itfbgroup.ivanovii.bookLibrary.repository.AuthorRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Ivanov Ivan
 */
@RestController
public class AuthorController {
    private final AuthorRepository repository;

    public AuthorController(AuthorRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/authors")
    List<Author> all() {
        return repository.findAll();
    }

    @GetMapping("author/{id}")
    Author one(@PathVariable Long id){
        return repository.findById(id).orElseThrow(() -> new AuthorNotFoundException(id));
    }

    @PostMapping("/author")
    public void addBook(@RequestBody Author author){
        repository.save(author);
    }
}
