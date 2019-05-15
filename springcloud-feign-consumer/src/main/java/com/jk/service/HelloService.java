package com.jk.service;

import com.jk.Utils.HiError;
import com.jk.model.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient(value="service-hi",fallback= HiError.class)
public interface HelloService  extends HelloServiceApi{


}
