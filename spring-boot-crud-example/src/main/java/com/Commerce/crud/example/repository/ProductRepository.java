package com.Commerce.crud.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Commerce.crud.example.entity.Product;

public interface ProductRepository extends JpaRepository<Product,Integer> {
    Product findByName(String name);
}

