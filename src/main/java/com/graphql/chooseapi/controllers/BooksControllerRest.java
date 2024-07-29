package com.graphql.chooseapi.controllers;

import com.graphql.chooseapi.dtos.Book;
import com.graphql.chooseapi.services.BooksService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BooksControllerRest {

    private final BooksService booksService;

    public BooksControllerRest(BooksService booksService) {
        this.booksService = booksService;
    }

    @GetMapping("/rest/books")
    public List<Book> books() {
        return booksService.getBooks();
    }

}
