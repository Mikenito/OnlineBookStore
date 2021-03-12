package com.online.book.store.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@Table ( name = "books" )
public class Book {

    @Id
    @GeneratedValue ( strategy = GenerationType.IDENTITY )
    private int id;

    @Column ( nullable = false, name = "isbn" )
    private String ISBN;

    @Column ( nullable = false )
    private String title;

    @Column
    private String author;

    public Book(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    @Override
    public String toString() {
        return "(ISBN='" + ISBN + '\'' + ", title='" + title + '\'' + ")";
    }

}