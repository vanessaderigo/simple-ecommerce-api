package com.vanessa.simpleecommerceapi.product.repository;

import com.vanessa.simpleecommerceapi.product.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
