package com.vanessa.simpleecommerceapi.order.repository;

import com.vanessa.simpleecommerceapi.order.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
