package com.snowy.southwind.feign;

import com.snowy.southwind.bean.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(value = "user")
public interface UserFeign {
    //查询所有用户信息
    @GetMapping("/user/findAll/{index}/{limit}")
    List < User > findAll(@PathVariable("index") Integer index, @PathVariable("limit") Integer limit);

    //查询信息数目
    @GetMapping("/user/count")
    Integer count();

//    //用户添加
////    @FeignClient(value = "save",fallback = UserFeignHystrix.class)
//    @PostMapping("/user/save")
//    void save(@RequestBody User user);

    // 用户删除
    @DeleteMapping("/user/deleteById/{id}")
    void deleteById(@PathVariable("id") long id);

}
