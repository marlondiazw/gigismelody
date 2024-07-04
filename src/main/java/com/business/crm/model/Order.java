package com.business.crm.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;
@Getter
@Setter
@Entity(name = "orden")
public class Order {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column(name = "fecha")
    private Date date;

    @Column (name = "tipo")
    private Integer orderType;

    @Column(name = "estado")
    private String state;

    @JsonIgnore //Avoid json-infinite-recursion
    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private Client client;

    @OneToMany(mappedBy = "order", cascade = CascadeType.ALL)
    private List<OrderDetail> orderDetails;


}
