package com.online.book.store.services;

import com.online.book.store.domain.Book;
import com.online.book.store.domain.Order;
import com.online.book.store.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

    public Order saveBookOrder(String ISBN, Integer quantity) {
        Book bookFound = this.bookService.findBooksByISBN(ISBN);
        Order order = new Order();
        order.setBook(bookFound);
        order.setQuantity(quantity);
        System.out.println(order);
        Order savedOrder = this.orderRepository.save(order);
        return savedOrder;
    }

    public List<Order> getAllBookOrders() {
        return (List<Order>) this.orderRepository.findAll();
    }

}
