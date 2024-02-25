package com.sandwichTruckSystem.STMS.dto;

import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
public class OrderDto {

    private Long id;

    private LocalDate created;

    private List<SandwichDto> sandwiches;
}
