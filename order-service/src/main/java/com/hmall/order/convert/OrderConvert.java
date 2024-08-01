package com.hmall.order.convert;

import com.hmall.order.pojo.Order;
import com.hmall.order.pojo.OrderVO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
@Mapper(componentModel = "spring")
public abstract class OrderConvert {
    public static OrderConvert ASSEMBLE = Mappers.getMapper(OrderConvert.class);
    public abstract OrderVO OrderAssemble(Order order);
}
