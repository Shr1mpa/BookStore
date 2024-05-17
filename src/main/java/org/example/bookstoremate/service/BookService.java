package org.example.bookstoremate.service;

import org.example.bookstoremate.model.Book;
import java.util.List;

public interface BookService {
    Book save(Book book);
    List<Book> findAll();
}
