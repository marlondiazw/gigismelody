package com.business.crm.model;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity (name = "cliente")
public class Client {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    @Column (name = "nombres")
    private String name;

    @Column (name = "apellidos")
    private String lastName;

    @Column (name = "numero_whatsapp")
    private String whatsapp;

    @Column (name = "telefono")
    private String phone;

    @Column (name = "fecha_cumple")
    private Date birthDay;

    @ManyToOne
    private Address address;

}
