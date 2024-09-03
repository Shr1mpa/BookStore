package org.example.bookstoremate.dto;

import java.math.BigDecimal;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BookDto {
    private int id;
    private String title;
    private String author;
    private BigDecimal price;
    private String description;
    private String coverImage;
}
