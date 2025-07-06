package com.vanessa.simpleecommerceapi.category.service;

import com.vanessa.simpleecommerceapi.category.model.Category;
import com.vanessa.simpleecommerceapi.category.repository.CategoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CategoryService {

    private final CategoryRepository repository;

    public Category findById(long id){
        Optional<Category> optional = repository.findById(id);
        return optional.get();
    }

}
