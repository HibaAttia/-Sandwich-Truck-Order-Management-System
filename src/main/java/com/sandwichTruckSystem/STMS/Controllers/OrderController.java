package com.sandwichTruckSystem.STMS.Controllers;

import com.sandwichTruckSystem.STMS.Dtos.IngredientDto;
import com.sandwichTruckSystem.STMS.Dtos.OrderDto;
import com.sandwichTruckSystem.STMS.Dtos.SandwichDto;
import com.sandwichTruckSystem.STMS.Entities.Ingredient;
import com.sandwichTruckSystem.STMS.Entities.Order;
import com.sandwichTruckSystem.STMS.Mappers.OrderMapper;
import com.sandwichTruckSystem.STMS.Services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @Autowired
    private OrderMapper orderMapper;



    @PostMapping("/placeOrder")
    public ResponseEntity<OrderDto> placeOrder(@RequestBody OrderDto orderDto) {

        Order order =  orderService.placeOrder(orderDto);
        return ResponseEntity.status(HttpStatus.OK).body(orderMapper.mapToOrderDto(order));

    }
}
