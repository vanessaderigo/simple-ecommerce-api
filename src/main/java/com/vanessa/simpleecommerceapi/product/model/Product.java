package com.vanessa.simpleecommerceapi.product.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.vanessa.simpleecommerceapi.category.model.Category;
import com.vanessa.simpleecommerceapi.order.model.Order;
import com.vanessa.simpleecommerceapi.order.model.OrderItem;
import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "tb_product")
@Data
@NoArgsConstructor
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String description;

    @Column(precision = 12, scale = 2)
    private BigDecimal price;

    private String imgUrl;

    @Getter
    @ManyToMany
    @JoinTable(name = "tb_product_category", joinColumns = @JoinColumn(name = "product_id"), inverseJoinColumns = @JoinColumn(name = "category_id"))
    private Set<Category> categories = new HashSet<>();

    @OneToMany(mappedBy = "id.product")
    private Set<OrderItem> items = new HashSet<>();

    public Product(Long id, String name, String description, BigDecimal price, String imgUrl) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.imgUrl = imgUrl;
    }

    @JsonIgnore
    public Set<Order> getOrders() {
        Set<Order> set = new HashSet<>();
        for(OrderItem x : items) {
            set.add(x.getOrder());
        }
        return set;
    }
}
