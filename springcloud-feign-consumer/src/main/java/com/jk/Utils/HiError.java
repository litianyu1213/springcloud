package com.jk.Utils;

import com.jk.model.User;
import com.jk.service.HelloService;
import org.springframework.stereotype.Component;

@Component
public class HiError implements HelloService {
    @Override
    public String Hello(String name) {

        return "sorry";
    }

    @Override
    public User HelloUser(User user) {
        User user1 = new User();
        user1.setId(1);
        user1.setName("错误额");
        user1.setSex("女");
        return user1;
    }
}
