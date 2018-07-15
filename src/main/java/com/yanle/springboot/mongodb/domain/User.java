package com.yanle.springboot.mongodb.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author yanle
 * @create 2018-07-15 12:44
 **/
@Getter
@Setter
@ToString
@AllArgsConstructor
@Document(collection = "user1")
public class User {
    @Id
    private Integer id;
    private String name;
    private int age;

    private User spouse;
}
