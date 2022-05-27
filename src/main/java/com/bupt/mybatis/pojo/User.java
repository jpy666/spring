package com.bupt.mybatis.pojo;

import lombok.*;

/**
 * @Author: 金培源
 * @Date: 2022/4/24 10:36
 * @Version: 1.0
 * @Description:
 */
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class User {
    private Integer id;
    private String username;
    private String password;
    private Integer money;
    private String gender;
    private String email;
}
