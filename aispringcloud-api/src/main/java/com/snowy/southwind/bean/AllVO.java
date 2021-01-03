package com.snowy.southwind.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class AllVO {
    private Integer code;
    private String msg;
    private Integer count;
    private List data;
}
