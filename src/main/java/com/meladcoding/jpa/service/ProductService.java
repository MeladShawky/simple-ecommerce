package com.meladcoding.jpa.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.meladcoding.jpa.models.Product;
import com.meladcoding.jpa.repositories.ProductRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class ProductService {

    private ProductRepository productRepository;

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public Product getProductById(int id) {
        return productRepository.findById(id).orElse(null);
    }
}
