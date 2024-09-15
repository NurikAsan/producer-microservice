package com.example.generatormicroservice.web.mapper;

import com.example.generatormicroservice.model.test.DataTestOptions;
import com.example.generatormicroservice.web.dto.DataTestOptionsDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface DataTestOptionsMapper extends Mappable<DataTestOptions, DataTestOptionsDto> {
}
