package org.example.bookstoremate.repository;

import org.example.bookstoremate.model.Book;
import java.util.List;

public interface BookRepository {
    Book save(Book book);

    List<Book> findAll();
}
