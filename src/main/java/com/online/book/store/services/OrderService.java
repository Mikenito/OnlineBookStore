package com.online.book.store.services;

import com.online.book.store.domain.Book;
import com.online.book.store.domain.Order;
import com.online.book.store.exceptions.BookNotFoundException;
import com.online.book.store.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class OrderService {

    private OrderRepository orderRepository;

    private BookService bookService;

    @Autowired
    public OrderService(OrderRepository orderRepository, BookService bookService) {
        this.orderRepository = orderRepository;
        this.bookService = bookService;
    }

    public Order saveBookOrder(String ISBN, Integer quantity) {
        Book bookFound = null;
        Order order = new Order();
        bookFound = this.bookService.findBooksByISBN(ISBN);
        if(bookFound == null) {
            throw new BookNotFoundException();
        }
        order.setBook(bookFound);
        order.setQuantity(quantity);
        System.out.println(order);
        return this.orderRepository.save(order);
    }

    public List<Order> getAllBookOrders() {
        return (List<Order>) this.orderRepository.findAll();
    }

}
