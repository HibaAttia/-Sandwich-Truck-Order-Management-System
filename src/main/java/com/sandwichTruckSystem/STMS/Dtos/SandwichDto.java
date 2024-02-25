package com.sandwichTruckSystem.STMS.Dtos;

import com.sandwichTruckSystem.STMS.Entities.Ingredient;
import lombok.Data;

import javax.persistence.OneToMany;
import java.util.List;

@Data
public class SandwichDto {

    private Long id;

    private int quantity;

    private double cost;

    private List<IngredientDto> ingredientList;
}
