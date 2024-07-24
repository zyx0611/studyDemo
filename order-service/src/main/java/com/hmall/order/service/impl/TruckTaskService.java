package com.hmall.order.service.impl;

import com.hmall.order.Enum.TaskEnum;
import com.hmall.order.Enum.TaskTypeEnum;
import com.hmall.order.pojo.Order;
import com.hmall.order.service.BaseTaskService;
import org.springframework.stereotype.Service;

@Service(TaskEnum.TRUCK + "task")
public class TruckTaskService implements BaseTaskService {
    @Override
    public Order getOrder() {
        return null;
    }
}
