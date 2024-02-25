package com.sandwichTruckSystem.STMS.service;

import com.sandwichTruckSystem.STMS.dto.OrderDto;
import com.sandwichTruckSystem.STMS.entity.Ingredient;
import com.sandwichTruckSystem.STMS.entity.Order;
import com.sandwichTruckSystem.STMS.entity.Sandwich;
import com.sandwichTruckSystem.STMS.mappers.OrderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    private OrderMapper orderMapper;


    public Order placeOrder(OrderDto orderDto) {
        Order order = orderMapper.mapToOrder(orderDto);

        // Calculate sandwich cost for each sandwich in the order
        for (Sandwich sandwich : order.getSandwiches()) {
            double sandwichCost = calculateSandwichCost(sandwich);
            sandwich.setCost(sandwichCost);
        }
        // Additional logic or database operations if needed
        return order;
    }

    private double calculateSandwichCost(Sandwich sandwich) {
        double ingredientCost = sandwich.getIngredientList().stream()
                .mapToDouble(Ingredient::getPrice)
                .sum();
        // Applying 30% profit margin
        return ingredientCost + (ingredientCost * 0.3);
    }

}
