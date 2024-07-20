package com.business.crm.service;

import com.business.crm.dto.CustomerDto;
import com.business.crm.model.Customer;
import java.util.List;

public interface ICustomerService {

    List<Customer> getAll();
    void save(Customer client);
    void findById(Integer id);
}
