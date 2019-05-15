package com.jk.controller;


import com.jk.model.User;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @RequestMapping(value="/hello",method=RequestMethod.POST)
    public User queryUser(@RequestBody User user){
        System.out.println(user);
        User u = new User();
        u.setId(2);
        u.setName("李天雨");
        u.setSex("男");
        return u;
    }
    @RequestMapping(value="/helloLiu",method=RequestMethod.POST)
    public User helloLiu(@RequestBody User user){
        System.out.println(user);
        User u = new User();
        u.setId(2);
        u.setName("李天雨");
        u.setSex("男");
        return u;
    }
}
