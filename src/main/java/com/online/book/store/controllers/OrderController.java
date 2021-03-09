package com.online.book.store.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ( "/api/orders" )
public class OrderController {

    @PostMapping
    public String createBookOrder() {
        return "will create book orders";
    }

    @GetMapping
    public String getAllBookOrders() {
        return "will return all book orders";
    }

}
