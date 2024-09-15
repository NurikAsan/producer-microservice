package com.example.generatormicroservice.web.mapper;

import com.example.generatormicroservice.model.Data;
import com.example.generatormicroservice.web.dto.DataDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface DataMapper extends Mappable<Data, DataDto> {

}
