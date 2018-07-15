package com.yanle.springboot.mongodb.service.impl;

import com.yanle.springboot.mongodb.dao.UserRepository;
import com.yanle.springboot.mongodb.domain.User;
import com.yanle.springboot.mongodb.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author yanle
 * @create 2018-07-15 12:53
 **/
@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserRepository userRepository;
    @Override
    public void save(User user) {
        userRepository.save(user);
    }

    @Override
    public User findByName(String name) {
        return this.userRepository.findByName(name);
    }
}
