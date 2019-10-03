package com.github.fernandotaa.proxyapi.controller.dto;

import com.github.fernandotaa.proxyapi.client.mockedapi.PersonDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class CostumerDTO {

    private Long id;
    private String name;
    private String type;

    public CostumerDTO(PersonDTO person) {
        this.id = person.id;
        this.name = person.name;
        this.type = "normal";
    }
}
