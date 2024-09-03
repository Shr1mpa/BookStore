package org.example.bookstoremate.mapper;

import org.example.bookstoremate.config.MapperConfig;
import org.example.bookstoremate.dto.BookDto;
import org.example.bookstoremate.dto.CreateBookRequestDto;
import org.example.bookstoremate.model.Book;
import org.mapstruct.Mapper;

@Mapper(config = MapperConfig.class)
public interface BookMapper {
    BookDto toDto(Book book);

    Book toModel(CreateBookRequestDto requestDto);
}
