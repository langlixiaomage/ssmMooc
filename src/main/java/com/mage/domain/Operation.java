package com.mage.domain;

import lombok.Data;

import java.util.Date;

@Data
public class Operation {
    private Integer id;
    private String name;
    private Date time;
    private Integer type;
    private String username;
}
