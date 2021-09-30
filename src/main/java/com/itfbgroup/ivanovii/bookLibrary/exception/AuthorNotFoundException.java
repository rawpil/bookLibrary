package com.itfbgroup.ivanovii.bookLibrary.exception;

/**
 * @author Ivanov Ivan
 */
public class AuthorNotFoundException extends RuntimeException {
    public AuthorNotFoundException(Long id) {
        super("Author not found " + id);
    }
}
