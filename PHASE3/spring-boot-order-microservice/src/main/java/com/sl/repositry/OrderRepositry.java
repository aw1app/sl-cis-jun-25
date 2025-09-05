package com.sl.repositry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sl.entity.Order;

@Repository
public interface OrderRepositry extends JpaRepository<Order, Integer>{

}