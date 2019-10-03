package com.github.fernandotaa.mockedapi.controller;

import com.github.fernandotaa.mockedapi.controller.dto.PersonDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/person")
public class PersonController {

    @GetMapping("/")
    public ResponseEntity<List<PersonDTO>> getPeople() {
        return ResponseEntity.ok(Arrays.asList(
                new PersonDTO(1L, "João da Silva", "123456789")
        ));
    }
}
