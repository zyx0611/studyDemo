package com.hmall.order.Enum;

import com.baomidou.mybatisplus.annotation.EnumValue;
import com.fasterxml.jackson.annotation.JsonValue;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum TaskTypeEnum {
    TRUCK("truck", "陆运"),
    WAREHOUSE("warehouse", "仓库"),
    ;
    @EnumValue
    private final String code;
    @JsonValue
    private final String msg;
}
