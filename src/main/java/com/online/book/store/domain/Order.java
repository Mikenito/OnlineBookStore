package com.online.book.store.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@Table ( name = "orders" )
public class Order {

    @Id
    @GeneratedValue ( strategy = GenerationType.AUTO )
    private int id;

    @Column
    private Integer quantity;

    @OneToOne
    @JoinColumn(name = "book_id")
    private Book book;


}
