package com.business.crm.service;

import com.business.crm.repository.IClientRepository;
import com.business.crm.model.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ClientServiceImpl implements IClientService {

    @Autowired
    private IClientRepository clientRepository;

    @Override
    @Transactional
    public List<Client> getAll() {
        return clientRepository.findAll();
    }

    @Override
    public void save(Client client) {

    }

    @Transactional
    @Override
    public void findById(Integer id) {

    }
}
