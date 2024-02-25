package com.sandwichTruckSystem.STMS.Services;

import com.sandwichTruckSystem.STMS.Dtos.IngredientDto;
import com.sandwichTruckSystem.STMS.Dtos.OrderDto;
import com.sandwichTruckSystem.STMS.Dtos.SandwichDto;
import com.sandwichTruckSystem.STMS.Dtos.StatisticsDto;
import com.sandwichTruckSystem.STMS.Entities.Order;
import com.sandwichTruckSystem.STMS.Mappers.OrderMapper;
import com.sandwichTruckSystem.STMS.Repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class StatisticsService {

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private  OrderMapper orderMapper;


    public StatisticsDto getStatistics(LocalDate date){
        List<Order> orders = orderRepository.findByCreated(date);
        List<OrderDto> orderDtos = orderMapper.mapToOrderDtoList(orders);
        // Calculate best-selling ingredients, number of sandwiches sold, and profit
        List<IngredientDto> bestSellingIngredients = calculateBestSellingIngredients(orderDtos);
        double soldSandwichNumber = calculateNumberOfSandwichesSold(orderDtos);
        double profit = calculateProfit(orderDtos);

        // Populate StatisticsDto
        StatisticsDto statisticsDto = new StatisticsDto();
        statisticsDto.setDate(date);
        statisticsDto.setBestSellingIngredients(bestSellingIngredients);
        statisticsDto.setSoldSandwichNumber(soldSandwichNumber);
        statisticsDto.setProfit(profit);

        return statisticsDto;
    }

    private List<IngredientDto> calculateBestSellingIngredients(List<OrderDto> orders) {

        // Flatten the list of orders to get all ingredients
        List<IngredientDto> allIngredients = orders.stream()
                .flatMap(order -> order.getSandwiches().stream())
                .flatMap(sandwich -> sandwich.getIngredientList().stream())
                .collect(Collectors.toList());

        // Count occurrences of each ingredient
        Map<String, Long> ingredientCountMap = allIngredients.stream()
                .collect(Collectors.groupingBy(IngredientDto::getName, Collectors.counting()));

        // Sort the ingredients by count in descending order
        List<IngredientDto> sortedIngredients = ingredientCountMap.entrySet().stream()
                .sorted(Map.Entry.<String, Long>comparingByValue().reversed())
                .map(entry -> new IngredientDto())
                .collect(Collectors.toList());

        // Get the top 3 repeated ingredients
        List<IngredientDto> topIngredients = sortedIngredients.stream()
                .limit(3)
                .collect(Collectors.toList());

        return topIngredients;

    }

    private double calculateNumberOfSandwichesSold(List<OrderDto> orders) {
        return orders.stream()
                .flatMap(order -> order.getSandwiches().stream())
                .mapToDouble(SandwichDto::getQuantity)
                .sum();

    }

    private double calculateProfit(List<OrderDto> orders) {
        return orders.stream()
                .flatMap(order -> order.getSandwiches().stream())
                .mapToDouble(this::calculateSandwichProfit)
                .sum();
    }

    private double calculateSandwichProfit(SandwichDto sandwich) {
        double ingredientCost = sandwich.getIngredientList().stream()
                .mapToDouble(IngredientDto::getPrice)
                .sum();

        return (sandwich.getCost() - ingredientCost) * sandwich.getQuantity();
    }
}
