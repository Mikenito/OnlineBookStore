package com.online.book.store.services;

import com.online.book.store.domain.Book;
import com.online.book.store.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {

    private BookRepository bookRepository;

    @Autowired
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public Book findBooksByISBN(String ISBN) {
        return this.bookRepository.findBookByISBN(ISBN);
    }

}
