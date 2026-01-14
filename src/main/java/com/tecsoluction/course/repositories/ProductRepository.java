package com.tecsoluction.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tecsoluction.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
