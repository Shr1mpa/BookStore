package org.example.bookstoremate.service;

import java.util.List;
import org.example.bookstoremate.dto.BookDto;
import org.example.bookstoremate.dto.CreateBookRequestDto;

public interface BookService {
    BookDto save(CreateBookRequestDto requestDto);

    List<BookDto> findAll();

    BookDto findById(Long id);
}
