package com.jk.service;

import com.jk.model.User;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

public interface HelloServiceApi {
    //和生产者的方法要保持一致
    //如果使用feign传递参数 一定要加@RequestParam 请求用get
    //如果使用feign传递对象 一定要加@RequestBody  请求用post
    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    String Hello(@RequestParam(value = "name") String name);


    @RequestMapping(value = "/hello",method = RequestMethod.POST)
    User HelloUser(@RequestBody User user);
}
