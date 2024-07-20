package com.business.crm.rest;

import ch.qos.logback.core.net.server.Client;
import com.business.crm.dto.CustomerDto;
import com.business.crm.model.Customer;
import com.business.crm.service.ICustomerService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/v1/client/")
public class CustomerController {

    @Autowired
    private ICustomerService clientService;

    @Autowired
    private ModelMapper customerMapper;

    @GetMapping("/getAll")
    public List<Customer> getAll() {
        return clientService.getAll();
    }

    @GetMapping("/getAllDto")
    public List<CustomerDto> getAllDto() {
        List<Customer> customers = clientService.getAll();
        return customers.stream()
                .map(this::convertToDto)
                .collect(Collectors.toList());
    }

    private CustomerDto convertToDto (Customer customer){
        CustomerDto customerDto = customerMapper.map(customer, CustomerDto.class);
        return customerDto;
    }
}
