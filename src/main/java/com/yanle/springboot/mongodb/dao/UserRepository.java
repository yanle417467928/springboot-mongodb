package com.yanle.springboot.mongodb.dao;

import com.yanle.springboot.mongodb.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * @author yanle
 * @create 2018-07-15 12:49
 **/

@Repository
public interface UserRepository extends MongoRepository<User,String> {
    User findByName(String name);
}
