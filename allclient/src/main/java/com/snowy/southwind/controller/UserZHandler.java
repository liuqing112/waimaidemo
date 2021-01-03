package com.snowy.southwind.controller;

import com.snowy.southwind.bean.User;
import com.snowy.southwind.feign.UserZFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserZHandler {
    @Autowired
    UserZFeign userZFeign;
    /*用户添加*/
    @PostMapping("/save")
    public String usersave(User user){
        userZFeign.save(user);
        return "redirect:/user_manage.html";
    }
}
