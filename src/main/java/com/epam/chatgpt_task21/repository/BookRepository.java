package com.epam.chatgpt_task21.repository;

import com.epam.chatgpt_task21.model.Author;
import com.epam.chatgpt_task21.model.Book;
import com.epam.chatgpt_task21.model.Genre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
    List<Book> findByTitleContainingOrAuthorNameContainingOrGenreNameContaining(
            String title, String authorName, String genreName);
}

