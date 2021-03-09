package com.online.book.store.services;

import com.online.book.store.domain.Book;
import com.online.book.store.domain.Order;
import com.online.book.store.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Service
public class OrderService {

    private OrderRepository orderRepository;

    private BookService bookService;

    @Autowired
    public OrderService(OrderRepository orderRepository, BookService bookService) {
        this.orderRepository = orderRepository;
        this.bookService = bookService;
    }

    public Order saveBookOrders(HashMap<String, Integer> orders) {
        List<Book> booksFound = this.bookService.findBooksByISBN(orders.keySet());
        List<Book> orderedBooks = new ArrayList<>();
        System.out.println("books found: " + booksFound);
        for (Book book : booksFound) {
            int quantities = orders.get(book.getISBN());
            for (int i = 0; i < quantities; i++) {
                orderedBooks.add(book);
            }
        }
        System.out.println("ordered books: " + orderedBooks);
        Order order = new Order();
        order.setBooks(orderedBooks);
        order.setId(1);
        return this.orderRepository.save(order);
    }

}
