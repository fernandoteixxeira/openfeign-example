package com.github.fernandotaa.proxyapi.client.mockedapi;

import lombok.Getter;

@Getter
public class PersonDTO {

    public final Long id;
    public final String name;
    public final String document;

    public PersonDTO(Long id, String name, String document) {
        this.id = id;
        this.name = name;
        this.document = document;
    }
}
