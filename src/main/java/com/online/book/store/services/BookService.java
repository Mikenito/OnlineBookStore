package com.online.book.store.services;

import com.online.book.store.domain.Book;
import com.online.book.store.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Service
public class BookService {

    private BookRepository bookRepository;

    @Autowired
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public List<Book> findBooksByISBN(Set<String> ISBN){
        List<Book> books = new ArrayList<>();
        for (String ISBNs : ISBN) {
            books.add(this.bookRepository.findBookByISBN(ISBNs).get());
        }
        return books;
    }

}
