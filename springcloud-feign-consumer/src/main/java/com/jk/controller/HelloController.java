package com.jk.controller;

import com.jk.model.User;
import com.jk.service.HelloService;
import com.jk.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    //编译器报错，无视。 因为这个Bean是在程序启动的时候注入的，编译器感知不到，所以报错。
    @Autowired
    HelloService schedualServiceHi;

    @Autowired
    UserService userService;

    @GetMapping(value = "/hi")
    public String sayHi(@RequestParam String name) {

        return schedualServiceHi.Hello( name );
    }
    @GetMapping(value = "/hello")
    public User sayHello(@RequestParam String name) {
        User user = new User();
        user.setId(1);
        user.setName("阿萨德撒");
        user.setSex("男");
        return schedualServiceHi.HelloUser( user );
    }

    @GetMapping(value = "/helloLiu")
    public User sayHelloLiu(@RequestParam String name) {
        User user = new User();
        user.setId(1);
        user.setName("阿萨德撒");
        user.setSex("男");
        return userService.HelloUserLiu( user );
    }
}
