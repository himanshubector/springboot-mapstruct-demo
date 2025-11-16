package com.hims.mapstructdemo.repository;

import com.hims.mapstructdemo.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}

