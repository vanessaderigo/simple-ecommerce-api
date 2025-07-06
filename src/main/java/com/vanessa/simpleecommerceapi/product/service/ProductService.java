package com.vanessa.simpleecommerceapi.product.service;

import com.vanessa.simpleecommerceapi.product.model.Product;
import com.vanessa.simpleecommerceapi.product.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository repository;

    public List<Product> findAll(){
        return repository.findAll();
    }

    public Product findById(Long id){
        Optional<Product> optional = repository.findById(id);
        return optional.get();
    }
}
