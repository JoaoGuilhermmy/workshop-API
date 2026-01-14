package com.tecsoluction.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tecsoluction.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
