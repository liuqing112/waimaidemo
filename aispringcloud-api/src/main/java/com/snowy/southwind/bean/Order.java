package com.snowy.southwind.bean;

import lombok.Data;

import java.util.Date;


@Data
public class Order {
    private long id;
    private User user;
    private Menu menu;
    private Admin admin;
    private Date date;
    private String state;
}
