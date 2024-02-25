package com.sandwichTruckSystem.STMS.Entities;

import com.sandwichTruckSystem.STMS.Enums.IngredientTypeEnum;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name= "SANDWICH")
@Data
public class Sandwich {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int quantity;

    private double cost;

    @OneToMany
    private List<Ingredient> ingredientList;
}
