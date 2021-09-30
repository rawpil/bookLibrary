package com.itfbgroup.ivanovii.bookLibrary.controller;

import com.itfbgroup.ivanovii.bookLibrary.model.Book;
import com.itfbgroup.ivanovii.bookLibrary.exception.BookNotFoundException;
import com.itfbgroup.ivanovii.bookLibrary.repository.BookRepository;
import com.itfbgroup.ivanovii.bookLibrary.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Ivanov Ivan
 */
@RestController
public class BookController {
    private final BookRepository repository;
    @Autowired
    private BookService bookService;

    public BookController(BookRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/books")
    List<Book> all() {
      return repository.findAll();
    }

    @GetMapping("book/{id}")
    Book one(@PathVariable Long id){
        return repository.findById(id).orElseThrow(() -> new BookNotFoundException(id));
    }

    @PostMapping("/book")
    public Book addBook(@RequestBody Book book){
        return repository.save(book);
    }

    /*@PutMapping("/book/{id}")
    public void modifyBook(@RequestBody Book modifiedBook, @PathVariable Long id){
        return repository.findById(id)
                .map(book -> {

                })
                .orElseThrow(() -> new BookNotFoundException(id));
    }*/

    @GetMapping("/findbooks")
    List<Book> like(@RequestParam String sometext) {
        System.out.println(sometext);
        return bookService.findBook(sometext);
    }
}
