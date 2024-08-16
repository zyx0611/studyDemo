package com.hmall.user.event;

import org.apache.rocketmq.spring.annotation.RocketMQMessageListener;
import org.apache.rocketmq.spring.core.RocketMQListener;
import org.springframework.stereotype.Component;

@Component
@RocketMQMessageListener(consumerGroup = "consumerGroup", topic = "my-boot-topic")
public class orderCustomer implements RocketMQListener<String> {
    @Override
    public void onMessage(String s) {
        System.out.println("消息接受到：" + s);
    }
}
