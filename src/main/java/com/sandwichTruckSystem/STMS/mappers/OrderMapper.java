package com.sandwichTruckSystem.STMS.mappers;

import com.sandwichTruckSystem.STMS.dto.OrderDto;
import com.sandwichTruckSystem.STMS.entity.Order;
import org.mapstruct.Mapper;
import org.mapstruct.NullValueCheckStrategy;

import java.util.List;

@Mapper(componentModel = "spring",nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS)
public interface OrderMapper {

    OrderDto mapToOrderDto(Order source);

    List<OrderDto> mapToOrderDtoList(List<Order> source);

    Order mapToOrder(OrderDto source);
}
