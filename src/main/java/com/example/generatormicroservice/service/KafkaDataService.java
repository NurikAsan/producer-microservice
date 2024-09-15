package com.example.generatormicroservice.service;

import com.example.generatormicroservice.model.Data;

public interface KafkaDataService {
    void send(Data data);
}
