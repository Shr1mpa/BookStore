package org.example.bookstoremate.service;

import java.util.List;
import org.example.bookstoremate.model.Book;

public interface BookService {
    Book save(Book book);

    List<Book> findAll();
}
