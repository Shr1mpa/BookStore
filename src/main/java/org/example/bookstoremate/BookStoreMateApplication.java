package org.example.bookstoremate;

import org.example.bookstoremate.model.Book;
import org.example.bookstoremate.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.math.BigDecimal;

@SpringBootApplication
public class BookStoreMateApplication {
	@Autowired
	private BookService bookService;
	public static void main(String[] args) {
		SpringApplication.run(BookStoreMateApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner() {
		return args -> {
            Book book = new Book();
            book.setTitle("The little prince");
            book.setIsbn("456804");
            book.setAuthor("Antoine de Saint-Exupery");
            book.setDescription("First book");
            book.setPrice(BigDecimal.valueOf(120));
            book.setCoverImage("image");

            bookService.save(book);

            System.out.println(bookService.findAll());
        };
	}
}
