package com.hmall.order.convert;

import cn.hutool.core.util.StrUtil;
import com.hmall.order.pojo.Order;
import com.hmall.order.pojo.OrderDetail;
import com.hmall.order.pojo.OrderDetailVO;
import com.hmall.order.pojo.OrderVO;
import org.mapstruct.AfterMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

@Mapper(componentModel = "spring")
public abstract class OrderConvert {
//    public static OrderConvert ASSEMBLE = Mappers.getMapper(OrderConvert.class);
//    @Mapping(source = "Currency", target = "current", numberFormat = "#.00")
//    @Mapping(source = "orderDetailList", target = "orderDetailList")
//    public abstract OrderVO OrderAssemble(Order order);
//
//    public abstract OrderDetailVO OrderDetailAssemble(OrderDetail orderDetail);
//
//    @AfterMapping
//    public void afterDo2VO(Order order, @MappingTarget OrderVO orderVO) {
//        List<OrderDetailVO> orderDetailList = orderVO.getOrderDetailList();
//        List<Long> collect = orderDetailList.stream().map(OrderDetailVO::getOrderId).collect(Collectors.toList());
//        List<OrderDetailVO> collect1 = orderDetailList.stream().filter(e -> StrUtil.isNotEmpty(e.getImage())).collect(Collectors.toList());
//        Map<Long, OrderDetailVO> collect2 = orderDetailList.stream().collect(Collectors.toMap(OrderDetailVO::getId, Function.identity(), (a, b) -> a));
//        Map<Long, List<OrderDetailVO>> collect3 = orderDetailList.stream().collect(Collectors.groupingBy(OrderDetailVO::getId));
//    }

}
