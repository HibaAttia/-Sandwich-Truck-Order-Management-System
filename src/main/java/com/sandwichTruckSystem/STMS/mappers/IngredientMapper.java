package com.sandwichTruckSystem.STMS.mappers;

import com.sandwichTruckSystem.STMS.dto.IngredientDto;
import com.sandwichTruckSystem.STMS.entity.Ingredient;
import org.mapstruct.Mapper;
import org.mapstruct.NullValueCheckStrategy;

import java.util.List;

@Mapper(componentModel = "spring",nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS)
public interface IngredientMapper {

    IngredientDto mapToIngredientDto(Ingredient source);

    List<IngredientDto> mapToIngredientList(List<Ingredient> source);

}
