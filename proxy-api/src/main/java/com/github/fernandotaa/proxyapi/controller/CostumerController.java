package com.github.fernandotaa.proxyapi.controller;

import com.github.fernandotaa.proxyapi.client.mockedapi.MockedApiClient;
import com.github.fernandotaa.proxyapi.client.mockedapi.PersonDTO;
import com.github.fernandotaa.proxyapi.controller.dto.CostumerDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/costumer")
public class CostumerController {

    private MockedApiClient mockedApiClient;

    public CostumerController(MockedApiClient mockedApiClient) {
        this.mockedApiClient = mockedApiClient;
    }

    @GetMapping("/")
    public ResponseEntity<List<CostumerDTO>> getPeople() {
        List<CostumerDTO> costumers = mockedApiClient.getPeople().stream()
                .map(CostumerDTO::new)
                .collect(Collectors.toList());

        return ResponseEntity.ok(costumers);
    }
}
