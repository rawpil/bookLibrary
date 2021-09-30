package com.itfbgroup.ivanovii.bookLibrary.service;

import com.itfbgroup.ivanovii.bookLibrary.model.Book;
import com.itfbgroup.ivanovii.bookLibrary.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * @author Ivanov Ivan
 */
@Service("bookServiceImpl")
public class BookServiceImpl implements BookService{
    @Autowired
    private BookRepository bookRepository;

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Book> findBook(String substr) {
        return entityManager.createQuery("SELECT b FROM Book b where b.book_name LIKE :part")
                .setParameter("part", "%"+substr+"%")
                .getResultList();
    }
}
