package com.sandwichTruckSystem.STMS.Dtos;

import com.sandwichTruckSystem.STMS.Enums.IngredientTypeEnum;
import lombok.Data;

@Data
public class IngredientDto {

    private Long id;
    private String name;
    private double price;
    private int availableQuantity;
    private IngredientTypeEnum ingredientType;
}
