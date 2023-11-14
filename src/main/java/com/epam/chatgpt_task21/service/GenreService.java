package com.epam.chatgpt_task21.service;

import com.epam.chatgpt_task21.model.Genre;
import com.epam.chatgpt_task21.repository.GenreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class GenreService {
    @Autowired
    private GenreRepository genreRepository;

    public List<Genre> getAllGenres() {
        return genreRepository.findAll();
    }

    public Genre getGenreById(Long id) {
        return genreRepository.findById(id).orElse(null);
    }

    public Genre saveGenre(Genre genre) {
        return genreRepository.save(genre);
    }

    public void deleteGenre(Long id) {
        genreRepository.deleteById(id);
    }

    public List<Genre> searchGenres(String keyword) {
        return genreRepository.findByNameContaining(keyword);
    }
}

// AuthorService.java (similar structure)
// GenreService.java (similar structure)
