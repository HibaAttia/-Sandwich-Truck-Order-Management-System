package com.sandwichTruckSystem.STMS.Mappers;

import com.sandwichTruckSystem.STMS.Dtos.IngredientDto;
import com.sandwichTruckSystem.STMS.Dtos.OrderDto;
import com.sandwichTruckSystem.STMS.Entities.Ingredient;
import com.sandwichTruckSystem.STMS.Entities.Order;
import org.mapstruct.Mapper;
import org.mapstruct.NullValueCheckStrategy;

import java.util.List;

@Mapper(componentModel = "spring",nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS)
public interface OrderMapper {

    OrderDto mapToOrderDto(Order source);

    List<OrderDto> mapToOrderDtoList(List<Order> source);

    Order mapToOrder(OrderDto source);
}
