package com.sandwichTruckSystem.STMS.Controllers;

import com.sandwichTruckSystem.STMS.Dtos.StatisticsDto;
import com.sandwichTruckSystem.STMS.Entities.Ingredient;
import com.sandwichTruckSystem.STMS.Services.StatisticsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;
import java.util.Locale;

@RestController
@RequestMapping(value = "statistics")
public class StatisticsController {

    @Autowired
    private StatisticsService statisticsService;


    @GetMapping(value="getAll")
    public ResponseEntity<StatisticsDto> getStatistics(@PathVariable LocalDate date) {

        StatisticsDto statistics =  statisticsService.getStatistics(date);
        return ResponseEntity.status(HttpStatus.OK).body(statistics);

    }
}
