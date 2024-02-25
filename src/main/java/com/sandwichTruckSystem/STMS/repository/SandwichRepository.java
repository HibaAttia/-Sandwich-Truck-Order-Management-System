package com.sandwichTruckSystem.STMS.repository;

import com.sandwichTruckSystem.STMS.entity.Sandwich;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SandwichRepository extends JpaRepository<Sandwich, Long> {
}

