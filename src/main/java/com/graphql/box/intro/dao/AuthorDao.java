package com.graphql.box.intro.dao;

import com.graphql.box.intro.dto.Author;

import java.util.List;

public class AuthorDao {
    private final List<Author> authors;

    public AuthorDao(List<Author> authors) {
        this.authors = authors;
    }

    public Author getAuthor(String id) {
        return authors.stream()
          .filter(author -> id.equalsIgnoreCase(author.getId()))
          .findFirst()
          .orElseThrow(RuntimeException::new);
    }
}
