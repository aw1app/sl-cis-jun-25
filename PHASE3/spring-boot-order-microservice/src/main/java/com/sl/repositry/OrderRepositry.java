package com.sl.repositry;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.sl.entity.Order;

@Repository
public interface OrderRepositry extends JpaRepository<Order, Integer>{

	@Query(value = "SELECT * FROM orders WHERE UID=:userid", nativeQuery = true)
	List<Order> findAllOrdersByUserId(@Param("userid") String userid);
	
}