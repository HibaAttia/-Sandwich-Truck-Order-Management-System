package com.sandwichTruckSystem.STMS.repository;

import com.sandwichTruckSystem.STMS.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {

    @Query("SELECT o FROM Order o WHERE o.created = :date")
    List<Order> findByCreated(LocalDate date);
}

