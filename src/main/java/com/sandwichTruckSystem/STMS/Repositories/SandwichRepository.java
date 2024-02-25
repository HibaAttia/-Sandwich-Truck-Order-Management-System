package com.sandwichTruckSystem.STMS.Repositories;

import com.sandwichTruckSystem.STMS.Entities.Ingredient;
import com.sandwichTruckSystem.STMS.Entities.Sandwich;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SandwichRepository extends JpaRepository<Sandwich, Long> {
}

