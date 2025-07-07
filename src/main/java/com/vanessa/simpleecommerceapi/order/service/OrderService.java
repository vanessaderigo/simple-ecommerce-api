package com.vanessa.simpleecommerceapi.order.service;

import com.vanessa.simpleecommerceapi.order.model.Order;
import com.vanessa.simpleecommerceapi.order.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class OrderService {

    private final OrderRepository repository;

    public Order save(Order order){
        repository.save(order);
        return order;
    }

    public Order findById(Long id){
        Optional<Order> optional = repository.findById(id);
        return optional.get();
    }

}
