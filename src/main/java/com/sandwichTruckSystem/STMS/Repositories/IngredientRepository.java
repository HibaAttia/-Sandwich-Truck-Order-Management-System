package com.sandwichTruckSystem.STMS.Repositories;

import com.sandwichTruckSystem.STMS.Entities.Ingredient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface IngredientRepository extends JpaRepository<Ingredient, Long> {
}

