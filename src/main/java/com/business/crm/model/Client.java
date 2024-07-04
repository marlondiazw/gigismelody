package com.business.crm.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@Entity (name = "cliente")
public class Client {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column (name = "nombres", nullable = false)
    private String name;

    @Column (name = "apellidos", nullable = false)
    private String lastName;

    @Column (name = "numero_whatsapp", nullable = false)
    private String whatsapp;

    @Column (name = "telefono")
    private String phone;

    @Column (name = "fecha_cumple")
    private Date birthDay;

    @ManyToOne
    @JoinColumn(name = "direccion_id")
    private Address address;

    @OneToMany(mappedBy = "client")
    private List<Order> orders;

}
