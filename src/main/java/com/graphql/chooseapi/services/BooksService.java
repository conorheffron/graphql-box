package com.graphql.chooseapi.services;

import com.graphql.chooseapi.dtos.Author;
import com.graphql.chooseapi.dtos.Book;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class BooksService {

    private static final Author AUTHOR = new Author("Joanne", "Rowling");

    private static final List<Book> BOOKS = new ArrayList<>(Arrays.asList(
      new Book("Philosopher's Stone", AUTHOR, 1997),
      new Book("Goblet of Fire", AUTHOR, 2000),
      new Book("Deathly Hallows", AUTHOR, 2007)
    ));

    public List<Book> getBooks() {
        return BOOKS;
    }

}
