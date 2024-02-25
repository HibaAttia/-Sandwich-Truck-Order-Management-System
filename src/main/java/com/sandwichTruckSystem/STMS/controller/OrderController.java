package com.sandwichTruckSystem.STMS.controller;

import com.sandwichTruckSystem.STMS.dto.OrderDto;
import com.sandwichTruckSystem.STMS.entity.Order;
import com.sandwichTruckSystem.STMS.mappers.OrderMapper;
import com.sandwichTruckSystem.STMS.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
