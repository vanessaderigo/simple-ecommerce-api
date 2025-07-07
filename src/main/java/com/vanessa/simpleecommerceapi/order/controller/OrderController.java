package com.vanessa.simpleecommerceapi.order.controller;

import com.vanessa.simpleecommerceapi.order.model.Order;
import com.vanessa.simpleecommerceapi.order.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping("/orders")
@RequiredArgsConstructor
public class OrderController {

    private final OrderService service;

    @PostMapping
    public ResponseEntity<Order> save(@RequestBody Order order){
        service.save(order);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(order.getId()).toUri();
        return ResponseEntity.created(uri).body(order);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Order> findById(@PathVariable long id){
        Order order = service.findById(id);
        return ResponseEntity.ok(order);
    }

}
