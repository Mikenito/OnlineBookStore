package com.online.book.store.controllers;

import com.online.book.store.domain.Order;
import com.online.book.store.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping ( "/api/orders" )
public class OrderController {

    private OrderService orderService;

    @Autowired
    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @PostMapping
    public Order createBookOrder(@RequestBody HashMap<String, String> orders) {
        String ISBN = orders.get("ISBN");
        Integer quantity = Integer.parseInt(orders.get("quantity"));
        return this.orderService.saveBookOrder(ISBN, quantity);
    }

    @GetMapping
    public List<Order> getAllBookOrders() {
        return this.orderService.getAllBookOrders();
    }

}
