package com.business.crm.service;

import com.business.crm.model.Client;
import java.util.List;

public interface IClientService {

    List<Client> getAll();
    void save(Client client);
    void findById(Integer id);
}
