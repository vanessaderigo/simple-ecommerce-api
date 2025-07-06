package com.vanessa.simpleecommerceapi.order.model.pk;

import com.vanessa.simpleecommerceapi.order.model.Order;
import com.vanessa.simpleecommerceapi.product.model.Product;
import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Embeddable
@Data
public class OrderItemPK {
    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order order;
    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;
}
