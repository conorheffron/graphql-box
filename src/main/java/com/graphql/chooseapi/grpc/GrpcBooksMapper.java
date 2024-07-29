package com.graphql.chooseapi.grpc;

import com.graphql.chooseapi.BooksServiceOuterClass;
import com.graphql.chooseapi.dtos.Author;
import com.graphql.chooseapi.dtos.Book;

public class GrpcBooksMapper {

    public static BooksServiceOuterClass.BookProto mapBookToProto(Book book) {
        return BooksServiceOuterClass.BookProto.newBuilder()
          .setTitle(book.getTitle())
          .setAuthor(BooksServiceOuterClass.AuthorProto.newBuilder()
            .setFirstName(book.getAuthor().getFirstName())
            .setLastName(book.getAuthor().getLastName())
            .build())
          .setYear(book.getYear())
          .build();
    }

    public static Book mapProtoToBook(BooksServiceOuterClass.BookProto bookProto) {
        return new Book(bookProto.getTitle(),
          new Author(bookProto.getAuthor().getFirstName(), bookProto.getAuthor().getLastName()),
          bookProto.getYear());
    }

}
