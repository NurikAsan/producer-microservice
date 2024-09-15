package com.example.generatormicroservice.web.controller;

import com.example.generatormicroservice.model.Data;
import com.example.generatormicroservice.model.test.DataTestOptions;
import com.example.generatormicroservice.service.KafkaDataService;
import com.example.generatormicroservice.service.TestDataService;
import com.example.generatormicroservice.web.dto.DataDto;
import com.example.generatormicroservice.web.dto.DataTestOptionsDto;
import com.example.generatormicroservice.web.mapper.DataMapper;
import com.example.generatormicroservice.web.mapper.DataTestOptionsMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/data")
@RequiredArgsConstructor
public class DataController {
    private final DataMapper dataMapper;
    private final KafkaDataService kafkaDataService;

    private final DataTestOptionsMapper dataTestOptionsMapper;
    private final TestDataService testDataService;

    @PostMapping("/send")
    public void send(@RequestBody DataDto dto){
        Data data = dataMapper.toEntity(dto);
        kafkaDataService.send(data);
    }

    @PostMapping("/test/send")
    public void testSend(@RequestBody DataTestOptionsDto testOptionsDto) {
        DataTestOptions testOptions = dataTestOptionsMapper.toEntity(testOptionsDto);
        testDataService.sendMessage(testOptions);
    }
}
