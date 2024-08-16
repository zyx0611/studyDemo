package com.hmall.order.event;

import org.apache.rocketmq.spring.core.RocketMQTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Component;

@Component
public class UserProduce {
    @Autowired
    private RocketMQTemplate rocketMQTemplate;
    // 普通mq
    public void sendMessage(String topic, String message) {
        rocketMQTemplate.convertAndSend(topic, message);
    }
    // 事务mq
    public void sendTransactionMessage(String topic, String message) {
        Message<String> build = MessageBuilder.withPayload(message).build();
        rocketMQTemplate.sendMessageInTransaction(topic, build, topic);
    }
}
