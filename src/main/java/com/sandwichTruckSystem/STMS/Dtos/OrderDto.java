package com.sandwichTruckSystem.STMS.Dtos;

import com.sandwichTruckSystem.STMS.Entities.Sandwich;
import lombok.Data;

import javax.persistence.OneToMany;
import java.time.LocalDate;
import java.util.List;

@Data
public class OrderDto {

    private Long id;

    private LocalDate created;

    private List<SandwichDto> sandwiches;
}
