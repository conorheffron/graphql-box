package com.graphql.chooseapi.grpc;

import com.graphql.chooseapi.BooksServiceGrpc.BooksServiceImplBase;
import com.graphql.chooseapi.BooksServiceOuterClass.BooksRequest;
import com.graphql.chooseapi.BooksServiceOuterClass.BooksResponse;

import com.graphql.chooseapi.dtos.Book;
import com.graphql.chooseapi.services.BooksService;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;

import java.util.List;

@GrpcService
public class BooksServiceGrpc extends BooksServiceImplBase {

    private final BooksService booksService;

    public BooksServiceGrpc(BooksService booksService) {
        this.booksService = booksService;
    }

    @Override
    public void books(BooksRequest request, StreamObserver<BooksResponse> responseObserver) {
        List<Book> books = booksService.getBooks();
        BooksResponse.Builder responseBuilder = BooksResponse.newBuilder();
        books.forEach(book -> responseBuilder.addBook(GrpcBooksMapper.mapBookToProto(book)));
        responseObserver.onNext(responseBuilder.build());
        responseObserver.onCompleted();
    }

}
