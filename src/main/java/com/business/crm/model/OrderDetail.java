package com.business.crm.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "detalle_orden")
public class OrderDetail {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @JsonIgnore //Avoid json-infinite-recursion
    @ManyToOne
    @JoinColumn(name = "orden_id")
    private Order order;

    @ManyToOne
    @JoinColumn(name = "producto_id")
    private Product product;

    @Column (name = "cantidad")
    private Integer quantity;
}
