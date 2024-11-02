package org.example.bookstoremate.repository.specification;

import org.example.bookstoremate.dto.BookSearchParams;
import org.springframework.data.jpa.domain.Specification;

public interface SpecificationBuilder<T> {
    Specification<T> build(BookSearchParams params);
}
