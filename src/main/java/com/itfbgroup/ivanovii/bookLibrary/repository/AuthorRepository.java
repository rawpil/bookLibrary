package com.itfbgroup.ivanovii.bookLibrary.repository;

import com.itfbgroup.ivanovii.bookLibrary.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Long> {
}
