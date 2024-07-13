package com.hmall.user.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.core.annotation.Order;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("orderservice")
@RequestMapping("/order")
public interface FeignClients {
    @RequestMapping("/getOrder")
    Order getOrder();
}
