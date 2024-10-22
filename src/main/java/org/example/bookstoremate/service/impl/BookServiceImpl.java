package org.example.bookstoremate.service.impl;

import java.util.List;
import java.util.Random;
import lombok.RequiredArgsConstructor;
import org.example.bookstoremate.dto.BookDto;
import org.example.bookstoremate.dto.CreateBookRequestDto;
import org.example.bookstoremate.exception.EntityNotFoundException;
import org.example.bookstoremate.mapper.BookMapper;
import org.example.bookstoremate.model.Book;
import org.example.bookstoremate.repository.BookRepository;
import org.example.bookstoremate.service.BookService;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BookServiceImpl implements BookService {
    private final BookRepository bookRepository;
    private final BookMapper bookMapper;

    @Override
    public BookDto save(CreateBookRequestDto requestDto) {
        Book book = bookMapper.toModel(requestDto);
        book.setIsbn(String.valueOf((new Random()).nextInt(1000)));
        return bookMapper.toDto(bookRepository.save(book));
    }

    @Override
    public List<BookDto> findAll() {
        return bookRepository.findAll().stream()
                .map(bookMapper::toDto)
                .toList();
    }

    @Override
    public BookDto findById(Long id) {
        Book book = bookRepository.findById(id).orElseThrow(
                () -> new EntityNotFoundException("Book with id " + id + " not found"));
        return bookMapper.toDto(book);
    }

    @Override
    public BookDto updateBook(Long id, BookDto bookDto) {
        Book book = bookRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Book not found with id: " + id));

        bookMapper.updateBookFromDto(bookDto, book);
        bookRepository.save(book);
        return bookMapper.toDto(book);
    }

    @Override
    public void deleteBook(Long id) {
        bookRepository.deleteById(id);
    }
}
