package com.springbuddy.vet;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@Document
public class Vet {

    @Id
    private String id;

    private String name;

    private String speciality;

    private Integer salary;

}