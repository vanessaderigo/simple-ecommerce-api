package com.vanessa.simpleecommerceapi.order.controller;

import com.vanessa.simpleecommerceapi.order.model.Order;
import com.vanessa.simpleecommerceapi.order.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/orders")
@RequiredArgsConstructor
public class OrderController {

    private final OrderService service;

    @GetMapping("/{id}")
    public ResponseEntity<Order> findById(@PathVariable long id){
        Order order = service.findById(id);
        return ResponseEntity.ok(order);
    }

}
