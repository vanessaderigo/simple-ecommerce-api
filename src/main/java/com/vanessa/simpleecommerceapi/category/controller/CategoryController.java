package com.vanessa.simpleecommerceapi.category.controller;

import com.vanessa.simpleecommerceapi.category.model.Category;
import com.vanessa.simpleecommerceapi.category.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/categories")
@RequiredArgsConstructor
public class CategoryController {

    private final CategoryService service;

    @GetMapping("/{id}")
    public ResponseEntity<Category> findById(@PathVariable long id){
        Category category = service.findById(id);
        return ResponseEntity.ok(category);
    }

}
