package com.vanessa.simpleecommerceapi.payment.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.vanessa.simpleecommerceapi.order.model.Order;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;

@Entity
@Table(name = "tb_payment")
@Data
@NoArgsConstructor
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Instant moment;

    @JsonIgnore
    @OneToOne
    @MapsId
    private Order order;

    public Payment(Long id, Instant moment) {
        this.id = id;
        this.moment = moment;
    }

    public Payment(Long id, Instant moment, Order order) {
        this.id = id;
        this.moment = moment;
        this.order = order;
    }
}
