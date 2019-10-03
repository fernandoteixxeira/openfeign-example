package com.github.fernandotaa.proxyapi.client.mockedapi;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "MockedApiClient", url = "http://localhost:8010")
public interface MockedApiClient {

    @GetMapping("/person/")
    List<PersonDTO> getPeople();
}
