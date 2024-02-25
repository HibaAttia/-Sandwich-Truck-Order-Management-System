package com.sandwichTruckSystem.STMS.Services;

import com.sandwichTruckSystem.STMS.Entities.Ingredient;
import com.sandwichTruckSystem.STMS.Repositories.IngredientRepository;
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
