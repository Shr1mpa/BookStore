package org.example.bookstoremate.mapper;

import org.example.bookstoremate.config.MapperConfig;
import org.example.bookstoremate.dto.BookDto;
import org.example.bookstoremate.dto.CreateBookRequestDto;
import org.example.bookstoremate.model.Book;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

@Mapper(config = MapperConfig.class)
public interface BookMapper {
    BookDto toDto(Book book);

    Book toModel(CreateBookRequestDto requestDto);

    @Mapping(target = "id", ignore = true)
    void updateBookFromDto(BookDto bookDto, @MappingTarget Book book);
}
