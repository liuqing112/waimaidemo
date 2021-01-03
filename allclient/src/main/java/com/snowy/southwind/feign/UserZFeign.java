package com.snowy.southwind.feign;

import com.snowy.southwind.bean.User;
import com.snowy.southwind.hystrix.UserZFeignHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(value = "user",fallback = UserZFeignHystrix.class)
public interface UserZFeign {
    //用户添加
//    @FeignClient(value = "save",fallback = UserFeignHystrix.class)
    @PostMapping("/user/save")
    void save(@RequestBody User user);
}
