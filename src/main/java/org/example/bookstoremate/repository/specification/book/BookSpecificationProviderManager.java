package org.example.bookstoremate.repository.specification.book;

import java.util.List;
import lombok.RequiredArgsConstructor;
import org.example.bookstoremate.model.Book;
import org.example.bookstoremate.repository.specification.SpecificationProvider;
import org.example.bookstoremate.repository.specification.SpecificationProviderManager;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class BookSpecificationProviderManager implements SpecificationProviderManager<Book> {
    private final List<SpecificationProvider<Book>> specificationProviders;

    @Override
    public SpecificationProvider<Book> getSpecificationProvider(String key) {
        return specificationProviders.stream()
                .filter(p -> p.getKey().equals(key))
                .findFirst()
                .orElseThrow(()
                        -> new RuntimeException("No specification provider found for key: " + key));
    }
}
