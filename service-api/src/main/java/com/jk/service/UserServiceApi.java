package com.jk.service;

import com.jk.model.User;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public interface UserServiceApi {

    @RequestMapping(value = "/helloLiu",method = RequestMethod.POST)
    User HelloUserLiu(@RequestBody User user);
}
