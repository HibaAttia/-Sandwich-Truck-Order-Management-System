package com.sandwichTruckSystem.STMS.dto;

import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
public class StatisticsDto {

    private LocalDate date;
    List<IngredientDto> bestSellingIngredients;
    private double soldSandwichNumber;
    private double profit;
}
