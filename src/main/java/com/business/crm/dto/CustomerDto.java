package com.business.crm.dto;

import lombok.Getter;
import lombok.Setter;

import java.sql.Date;

@Getter
@Setter
public class CustomerDto {

    private Long id;
    private String name;
    private String lastName;
    private String whatsapp;
    private String phone;
    private Date birthDay;

}
