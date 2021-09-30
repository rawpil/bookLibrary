package com.itfbgroup.ivanovii.bookLibrary.repository;

import com.itfbgroup.ivanovii.bookLibrary.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
