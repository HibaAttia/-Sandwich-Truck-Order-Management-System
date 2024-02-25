package com.sandwichTruckSystem.STMS.Entities;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;
import org.springframework.data.annotation.CreatedDate;
import java.util.List;

@Entity
@Table(name= "ORDER")
@Data
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @CreatedDate
    private LocalDate created;

    @OneToMany
    private List<Sandwich> sandwiches;
}
