package com.sandwichTruckSystem.STMS.Controllers;

import com.sandwichTruckSystem.STMS.Dtos.IngredientDto;
import com.sandwichTruckSystem.STMS.Entities.Ingredient;
import com.sandwichTruckSystem.STMS.Mappers.IngredientMapper;
import com.sandwichTruckSystem.STMS.Services.IngredientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "ingredient")
public class IngredientController {

    @Autowired
    private IngredientService ingredientService;

    @Autowired
    private IngredientMapper ingredientMapper;


    @GetMapping(value="getAll")
    public ResponseEntity<List<IngredientDto>> getAll() {

        List<Ingredient> ingredientList =  ingredientService.getAll();
        return ResponseEntity.status(HttpStatus.OK).body(ingredientMapper.mapToIngredientList(ingredientList));

    }
}
