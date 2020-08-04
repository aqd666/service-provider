package cn.jiyun.service.controller;

import cn.jiyun.service.pojo.User;
import cn.jiyun.service.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class UserController {


    @Autowired
     UserService userService;


    @GetMapping("{id}")
    public User queryUserById(@PathVariable("id") Long id){
        return this.userService.queryUserById(id);
    }


}
