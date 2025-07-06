package com.vanessa.simpleecommerceapi.order.repository;

import com.vanessa.simpleecommerceapi.order.model.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
