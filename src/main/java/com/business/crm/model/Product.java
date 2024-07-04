package com.business.crm.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "producto")
public class Product {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column(name = "descripcion")
    private String description;

    @Column(name = "talla")
    private String size;

    @Column (name = "color")
    private String color;

    @Column(name = "precio")
    private Double price;
}
