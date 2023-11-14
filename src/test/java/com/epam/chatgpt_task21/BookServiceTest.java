package com.epam.chatgpt_task21;

import com.epam.chatgpt_task21.model.Book;
import com.epam.chatgpt_task21.service.BookService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
public class BookServiceTest {

    @Autowired
    private BookService bookService;

    @Test
    public void testSaveAndGetBook() {
        // Create a test book
        Book book = new Book();
        book.setTitle("Test Book");
        book.setPrice(29.99);
        book.setQuantityAvailable(10);

        // Save the book
        Book savedBook = bookService.saveBook(book);
        assertNotNull(savedBook.getId());

        // Get the book by ID
        Book retrievedBook = bookService.getBookById(savedBook.getId());
        assertNotNull(retrievedBook);
        assertEquals("Test Book", retrievedBook.getTitle());
    }

    @Test
    public void testSearchBooks() {
        // Create and save test books
        Book book1 = new Book();
        book1.setTitle("Java Programming");
        book1.setPrice(39.99);
        book1.setQuantityAvailable(15);
        bookService.saveBook(book1);

        Book book2 = new Book();
        book2.setTitle("Spring Boot in Action");
        book2.setPrice(49.99);
        book2.setQuantityAvailable(20);
        bookService.saveBook(book2);

        // Search for books
        List<Book> searchResults = bookService.searchBooks("Java");
        assertEquals(1, searchResults.size());
        assertEquals("Java Programming", searchResults.get(0).getTitle());
    }


}
