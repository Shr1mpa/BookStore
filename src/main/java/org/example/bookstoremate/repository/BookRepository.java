package org.example.bookstoremate.repository;

import java.util.List;
import java.util.Optional;
import org.example.bookstoremate.model.Book;

public interface BookRepository {
    Book save(Book book);

    List<Book> findAll();

    Optional<Book> findById(long id);

}
