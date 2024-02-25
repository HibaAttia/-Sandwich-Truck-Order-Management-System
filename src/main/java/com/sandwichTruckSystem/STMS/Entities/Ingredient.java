package com.sandwichTruckSystem.STMS.Entities;

import javax.persistence.*;

import com.sandwichTruckSystem.STMS.Enums.IngredientTypeEnum;
import lombok.Data;

@Entity
@Table(name= "INGREDIENT")
@Data
public class Ingredient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private double price;
    private int availableQuantity;
    private IngredientTypeEnum ingredientType;
}
