package com.mmz.pojo;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @Classname User
 * @Description TODO
 * @Date 2020/5/4 21:24
 * @Created by mmz
 */
@Data
public class User implements Serializable {
    private  Integer id;
    private String username;
    private String address;
    private String sex;
    private Date birthday;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", address='" + address + '\'' +
                ", sex='" + sex + '\'' +
                ", birthday=" + birthday +
                '}';
    }
}
