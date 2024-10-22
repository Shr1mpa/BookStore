package org.example.bookstoremate.repository;

import org.example.bookstoremate.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
