package org.example.bookstoremate.repository.specification.book;

import java.util.Arrays;
import org.example.bookstoremate.model.Book;
import org.example.bookstoremate.repository.specification.SpecificationProvider;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Component;

@Component
public class IsbnSpecificationProvider implements SpecificationProvider<Book> {
    private static final String KEY = "isbn";

    @Override
    public Specification<Book> getSpecification(String... params) {
        return (root, query, criteriaBuilder)
                -> root.get(KEY).in(Arrays.stream(params).toArray());
    }

    @Override
    public String getKey() {
        return KEY;
    }
}
