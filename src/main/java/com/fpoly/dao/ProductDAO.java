package com.fpoly.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fpoly.model.Product;

public interface ProductDAO extends JpaRepository<Product, Integer>  {
    List<Product> findByNameContaining(String q);
}
