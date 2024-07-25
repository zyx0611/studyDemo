package com.hmall.order.service.impl;

import com.hmall.order.service.BaseTaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
@Service
public class TaskContext {
    @Autowired
    Map<String, BaseTaskService> BaseTaskServiceMap;

    public BaseTaskService getTaskService(String type) {
        // 日期格式转换类
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = new Date();
        String format = simpleDateFormat.format(date);
        // 数字格式转换
        DecimalFormat decimalFormat = new DecimalFormat("#.00");// 保留两位小数
        String format1 = decimalFormat.format(1.222);
        return BaseTaskServiceMap.get(type);
    }
}
