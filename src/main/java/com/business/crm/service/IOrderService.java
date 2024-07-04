package com.business.crm.service;

import com.business.crm.model.Client;
import com.business.crm.model.Order;

import java.util.List;
import java.util.Optional;

public interface IOrderService {

    List<Order> getAll();
    void save(Order client);
    Optional<Order> findById(Integer id);

}
