package com.sl.repositry;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.sl.entity.User;


public interface UserRepository extends MongoRepository<User, String> {
    User findByUsername(String username);
}
