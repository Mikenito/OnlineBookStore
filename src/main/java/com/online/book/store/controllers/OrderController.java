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
    public String createBookOrder(@RequestBody List<HashMap<String, String>> orders) {
        String result = "";
        for (HashMap<String, String> order : orders) {
            result += String.format("%s\n", createBookOrder(order));
        }
        return result;
    }

    @PostMapping("/order")
    private String createBookOrder(@RequestBody HashMap<String, String> orders) {
        Order order = this.orderService.saveBookOrder(orders.get("ISBN"), Integer.parseInt(orders.get("quantity")));
        String result = "Book " + order.getBook() + " has been ordered.";
        return result;
    }

    @GetMapping
    public List<Order> getAllBookOrders() {
        return this.orderService.getAllBookOrders();
    }


}
