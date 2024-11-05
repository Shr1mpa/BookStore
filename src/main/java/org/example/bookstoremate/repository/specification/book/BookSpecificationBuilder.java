package org.example.bookstoremate.repository.specification.book;

import lombok.RequiredArgsConstructor;
import org.example.bookstoremate.dto.BookSearchParams;
import org.example.bookstoremate.model.Book;
import org.example.bookstoremate.repository.specification.SpecificationBuilder;
import org.example.bookstoremate.repository.specification.SpecificationProviderManager;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class BookSpecificationBuilder implements SpecificationBuilder<Book> {
    private static final String AUTHOR_KEY = "author";
    private static final String ISBN_KEY = "isbn";
    private static final String TITLE_KEY = "title";
    private final SpecificationProviderManager<Book> specificationProviderManager;

    @Override
    public Specification<Book> build(BookSearchParams params) {
        Specification<Book> specification = Specification.where(null);
        if (params.author() != null && params.author().length > 0) {
            specification = specification.and(specificationProviderManager
                    .getSpecificationProvider(AUTHOR_KEY)
                    .getSpecification(params.author()));
        }
        if (params.title() != null && params.title().length > 0) {
            specification = specification.and(specificationProviderManager
                    .getSpecificationProvider(TITLE_KEY)
                    .getSpecification(params.title()));
        }

        if (params.isbn() != null && params.isbn().length > 0) {
            specification = specification.and(specificationProviderManager
                    .getSpecificationProvider(ISBN_KEY)
                    .getSpecification(params.isbn()));
        }
        return specification;
    }
}
