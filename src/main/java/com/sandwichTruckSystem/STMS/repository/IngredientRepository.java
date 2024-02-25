package com.sandwichTruckSystem.STMS.repository;

import com.sandwichTruckSystem.STMS.entity.Ingredient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IngredientRepository extends JpaRepository<Ingredient, Long> {
}

