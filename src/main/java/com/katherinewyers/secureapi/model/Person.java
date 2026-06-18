package com.katherinewyers.secureapi.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private boolean member;

    public Person(Long id, String name, boolean member) {
        this.id = id;
        this.name = name;
        this.member = member;
    }
}
