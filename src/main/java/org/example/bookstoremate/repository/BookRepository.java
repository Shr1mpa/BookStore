package org.example.bookstoremate.repository;

import java.util.List;
import org.example.bookstoremate.model.Book;

public interface BookRepository {
    Book save(Book book);

    List<Book> findAll();
}
