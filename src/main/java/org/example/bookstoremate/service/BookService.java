package org.example.bookstoremate.service;

import java.util.List;
import org.example.bookstoremate.dto.BookDto;
import org.example.bookstoremate.dto.BookSearchParams;
import org.example.bookstoremate.dto.CreateBookRequestDto;
import org.springframework.data.domain.Pageable;

public interface BookService {
    BookDto save(CreateBookRequestDto requestDto);

    List<BookDto> findAll();

    BookDto findById(Long id);

    BookDto updateBook(Long id, BookDto bookDto);

    void deleteBook(Long id);

    List<BookDto> search(BookSearchParams searchParams, Pageable pageable);
}
