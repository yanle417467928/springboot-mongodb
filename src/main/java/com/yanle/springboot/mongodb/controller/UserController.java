package com.yanle.springboot.mongodb.controller;

import com.yanle.springboot.mongodb.domain.ResultDTO;
import com.yanle.springboot.mongodb.domain.User;
import com.yanle.springboot.mongodb.service.UserService;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author yanle
 * @create 2018-07-15 12:54
 **/

@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Resource
    private UserService userService;

    @Resource
    private MongoTemplate mongoTemplate;

    /**
     * save use before findName
     *
     * @return
     */
    @PostMapping("/save")
    public ResultDTO<User> save(User user) {
        User spouse = new User(2,"闫乐",18,null);
        //也可以使用Repository插入数据，userService.save(user);
        user.setSpouse(spouse);
        userService.save(user);
        return new ResultDTO<>("0",null,null);
    }

    @GetMapping("/findAll")
    public ResultDTO<List<User>> find() {
        List<User> userList = mongoTemplate.findAll(User.class);
        return new ResultDTO<>("0",null,userList);
    }

    /**
     * input String name "Tseng"
     *
     * @param name
     * @return
     */
    @GetMapping("/findByName")
    public User findByName(@RequestParam("name") String name) {
        User user = userService.findByName(name);
        return user;
    }
}
