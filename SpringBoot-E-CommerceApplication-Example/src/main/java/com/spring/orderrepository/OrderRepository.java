package com.spring.orderrepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.order.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
