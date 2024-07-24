package com.hmall.order.service.impl;

import com.hmall.order.Enum.TaskEnum;
import com.hmall.order.pojo.Order;
import com.hmall.order.service.BaseTaskService;
import org.springframework.stereotype.Service;

@Service(TaskEnum.WAREHOUSE + "task")
public class WarehouseTaskService implements BaseTaskService {
    @Override
    public Order getOrder() {
        return null;
    }
}
