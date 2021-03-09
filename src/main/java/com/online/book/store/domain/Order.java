package com.online.book.store.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@Table ( name = "orders" )
public class Order {

    @Id
    @GeneratedValue ( strategy = GenerationType.AUTO )
    private int id;

    @Column
    private int quantity;

    @Column
    private String ISBN;

    @Column
    @OneToMany ( cascade = CascadeType.ALL )
    private List<Book> books;

}
