package com.example.Product1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Product1.entities.Product;

public interface ProductRepository extends JpaRepository<Product,Integer> {



	Product findByName(String name);



}
