package com.business.crm.service;

import com.business.crm.model.Order;
import com.business.crm.repository.IOrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class OrderServiceImpl implements IOrderService{

    @Autowired
    private IOrderRepository orderRepository;

    @Transactional
    public List<Order> getAll (){
        return orderRepository.findAll();
    }

    @Override
    public void save(Order client) {

    }

    @Override
    public Optional<Order> findById(Integer id) {
        return orderRepository.findById(id);
    }
}
