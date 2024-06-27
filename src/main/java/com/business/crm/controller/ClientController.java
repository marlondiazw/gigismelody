package com.business.crm.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/client/")
public class ClientController {

    @GetMapping("/getAll")
    public String getAll() {
        return "Lista de clientes : " + "message";
    }
}
