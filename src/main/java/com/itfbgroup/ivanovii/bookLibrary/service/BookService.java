package com.itfbgroup.ivanovii.bookLibrary.service;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface BookService {
    public List findBook(String substr);
}
