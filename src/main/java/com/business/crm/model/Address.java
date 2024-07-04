package com.business.crm.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity (name = "direccion")
public class Address {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column(name = "provincia")
    private String level1;

    @Column(name = "canton")
    private String level2;

    @Column(name = "distrito")
    private String level3;

    @Column(name = "barrio")
    private String level4;

}
