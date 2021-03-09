package com.online.book.store.repositories;

import com.online.book.store.domain.Book;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends CrudRepository<Book, Integer> {

    Book findBookByISBN(String ISBN);

}
