package com.snowy.southwind.hystrix;

import com.snowy.southwind.bean.User;
import com.snowy.southwind.feign.UserZFeign;
import org.springframework.stereotype.Component;



@Component
public class UserZFeignHystrix implements UserZFeign {
    @Override
    public void save(User user) {

    }
}
