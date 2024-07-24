package com.hmall.order.service.impl;

import com.hmall.order.service.BaseTaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;
@Service
public class TaskContext {
    @Autowired
    Map<String, BaseTaskService> BaseTaskServiceMap;

    public BaseTaskService getTaskService(String type) {
        return BaseTaskServiceMap.get(type);
    }
}
