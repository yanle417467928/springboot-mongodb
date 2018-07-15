package com.yanle.springboot.mongodb.service;

import com.yanle.springboot.mongodb.domain.User;

/**
 * @author yanle
 * @create 2018-07-15 12:52
 **/

public interface UserService {
    void save(User user);

    User findByName(String name);
}
