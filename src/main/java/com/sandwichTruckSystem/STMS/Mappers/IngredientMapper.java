package com.sandwichTruckSystem.STMS.Mappers;

import com.sandwichTruckSystem.STMS.Dtos.IngredientDto;
import com.sandwichTruckSystem.STMS.Entities.Ingredient;
import org.mapstruct.Mapper;
import org.mapstruct.NullValueCheckStrategy;

import java.util.List;

@Mapper(componentModel = "spring",nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS)
public interface IngredientMapper {

    IngredientDto mapToIngredientDto(Ingredient source);

    List<IngredientDto> mapToIngredientList(List<Ingredient> source);

}
