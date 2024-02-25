package com.sandwichTruckSystem.STMS.dto;

import com.sandwichTruckSystem.STMS.enums.IngredientTypeEnum;
import lombok.Data;

@Data
public class IngredientDto {

    private Long id;
    private String name;
    private double price;
    private int availableQuantity;
    private IngredientTypeEnum ingredientType;
}
