package com.sandwichTruckSystem.STMS.entity;

import javax.persistence.*;

import com.sandwichTruckSystem.STMS.enums.IngredientTypeEnum;
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
