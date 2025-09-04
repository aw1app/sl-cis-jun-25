package com.sl.repositry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sl.entity.User;


@Repository
public interface UserRepositry extends JpaRepository<User, Integer> {

	

}
