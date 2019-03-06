package com.mage.domain;

import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class UserInfo {
    private String nickname;
    private String username;
    private String name;
    private String email;
    private Date createtime;
    private String school;
    private String birthday;
    private Integer usertype;

    private List<Operation> operations;
}
