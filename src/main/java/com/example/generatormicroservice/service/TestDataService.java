package com.example.generatormicroservice.service;

import com.example.generatormicroservice.model.test.DataTestOptions;

public interface TestDataService {
    void sendMessage(DataTestOptions testOptions);
}
