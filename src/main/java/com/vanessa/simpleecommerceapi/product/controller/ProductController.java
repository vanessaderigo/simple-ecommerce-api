package com.vanessa.simpleecommerceapi.product.controller;

import com.vanessa.simpleecommerceapi.product.model.Product;
import com.vanessa.simpleecommerceapi.product.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService service;

    @GetMapping("/{id}")
    public ResponseEntity<Product> findById(@PathVariable long id){
        Product product = service.findById(id);
        return ResponseEntity.ok(product);
    }

}
