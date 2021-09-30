package com.itfbgroup.ivanovii.bookLibrary.exception;

/**
 * @author Ivanov Ivan
 */
public class BookNotFoundException extends RuntimeException {
    public BookNotFoundException(Long id) {
        super("Book not found " + id);
    }
}
