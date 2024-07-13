package com.hmall.user.web;

import com.hmall.user.feign.FeignClients;
import com.hmall.user.pojo.User;
import com.hmall.user.service.IUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.Order;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private IUserService userService;
    @Autowired
    private FeignClients feignClients;

    @GetMapping("/getUserWithOrder")
    public User getUserWithOrder() {
        Order order = feignClients.getOrder();
        return null;
    }
}
