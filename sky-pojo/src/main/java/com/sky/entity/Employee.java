package com.sky.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@Builder //这个注解在类上，将类转变为建造者模式，这是一种创建复杂对象的最佳方式。
@NoArgsConstructor //这个注解在类上，为类提供一个无参的构造方法。
@AllArgsConstructor //这个注解在类上，为类提供一个全参的构造方法。
public class Employee implements Serializable { //Serializable接口是启用其序列化功能的接口。实现java.io.Serializable接口的类是可序列化的。没有实现此接口的类将不能使其任何状态被序列化或反序列化。

    private static final long serialVersionUID = 1L;

    private Long id;

    private String username;

    private String name;

    private String password;

    private String phone;

    private String sex;

    private String idNumber;

    private Integer status;

    //@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime createTime;

    //@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime updateTime;

    private Long createUser;

    private Long updateUser;

}
