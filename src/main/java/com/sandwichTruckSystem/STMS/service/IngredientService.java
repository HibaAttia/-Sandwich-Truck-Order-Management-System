package com.sandwichTruckSystem.STMS.service;

import com.sandwichTruckSystem.STMS.entity.Ingredient;
import com.sandwichTruckSystem.STMS.repository.IngredientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IngredientService {

    @Autowired
    private IngredientRepository ingredientRepository;


    public List<Ingredient> getAll() {
        return ingredientRepository.findAll();
    }
}
