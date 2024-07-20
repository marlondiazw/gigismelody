package com.business.crm.service;

import com.business.crm.dto.CustomerDto;
import com.business.crm.repository.IClientRepository;
import com.business.crm.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CustomerServiceImpl implements ICustomerService {

    @Autowired
    private IClientRepository clientRepository;

    @Override
    @Transactional
    public List<Customer> getAll() {
        return clientRepository.findAll();
    }

    @Override
    public void save(Customer client) {

    }

    @Transactional
    @Override
    public void findById(Integer id) {

    }
}
