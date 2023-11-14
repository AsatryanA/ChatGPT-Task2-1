package com.epam.chatgpt_task21;

import com.epam.chatgpt_task21.model.Author;
import com.epam.chatgpt_task21.service.AuthorService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
public class AuthorServiceTest {

    @Autowired
    private AuthorService authorService;

    @Test
    public void testSaveAndGetAuthor() {
        // Create a test author
        Author author = new Author();
        author.setName("Test Author");

        // Save the author
        Author savedAuthor = authorService.saveAuthor(author);
        assertNotNull(savedAuthor.getId());

        // Get the author by ID
        Author retrievedAuthor = authorService.getAuthorById(savedAuthor.getId());
        assertNotNull(retrievedAuthor);
        assertEquals("Test Author", retrievedAuthor.getName());
    }

}
