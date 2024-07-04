package com.business.crm.rest;

import com.business.crm.model.Client;
import com.business.crm.service.IClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v1/client/")
public class ClientController {

    @Autowired
    private IClientService clientService;

    @GetMapping("/getAll")
    public List<Client> getAll() {
        return clientService.getAll();
    }
}
