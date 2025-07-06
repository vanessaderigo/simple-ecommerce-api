package com.vanessa.simpleecommerceapi.order.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.vanessa.simpleecommerceapi.order.model.pk.OrderItemPK;
import com.vanessa.simpleecommerceapi.product.model.Product;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

import java.math.BigDecimal;

@Entity
@Table(name = "tb_order_item")
@Data
@NoArgsConstructor
public class OrderItem {
    @EmbeddedId
    private OrderItemPK id = new OrderItemPK();

    private Integer quantity;

    @Column(precision = 10, scale = 2)
    private BigDecimal price;

    public BigDecimal getSubTotal() {
        if (quantity == null || price == null) {
            return BigDecimal.ZERO;
        }
        return price.multiply(BigDecimal.valueOf(quantity));
    }

    public OrderItem(Order order, Product product, Integer quantity, BigDecimal price) {
        id.setOrder(order);
        id.setProduct(product);
        this.quantity = quantity;
        this.price = price;
    }

    @JsonIgnore
    public Order getOrder() {
        return id.getOrder();
    }
}
