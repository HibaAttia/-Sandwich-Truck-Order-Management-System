package com.sandwichTruckSystem.STMS.dto;

import lombok.Data;

import java.util.List;

@Data
public class SandwichDto {

    private Long id;

    private int quantity;

    private double cost;

    private List<IngredientDto> ingredientList;
}
