package com.epam.chatgpt_task21;

import com.epam.chatgpt_task21.model.Genre;
import com.epam.chatgpt_task21.service.GenreService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
public class GenreServiceTest {

    @Autowired
    private GenreService genreService;

    @Test
    public void testSaveAndGetGenre() {
        // Create a test genre
        Genre genre = new Genre();
        genre.setName("Test Genre");

        // Save the genre
        Genre savedGenre = genreService.saveGenre(genre);
        assertNotNull(savedGenre.getId());

        // Get the genre by ID
        Genre retrievedGenre = genreService.getGenreById(savedGenre.getId());
        assertNotNull(retrievedGenre);
        assertEquals("Test Genre", retrievedGenre.getName());
    }

}
