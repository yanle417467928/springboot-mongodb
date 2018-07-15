package com.yanle.springboot.mongodb.domain;

import lombok.*;

/**
 * @author yanle
 * @create 2018-07-15 13:19
 **/

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class ResultDTO <T> {
    private String Code;

    private String message;

    private T t;
}
