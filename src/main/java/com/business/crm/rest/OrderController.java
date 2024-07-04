package com.business.crm.rest;

import com.business.crm.model.Order;
import com.business.crm.service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v1/order/")
public class OrderController {

    @Autowired
    private IOrderService orderService;

    @RequestMapping("/getAll")
    public List<Order> getAll () {
        return orderService.getAll();
    }

    @RequestMapping("/get/client/{id}")
    public List<Order> getByClientId (@PathVariable String id) {
        return orderService.getAll();
    }

    @RequestMapping("/get/{id}")
    public Order getById (@PathVariable Integer id) {
        return orderService.findById(id).orElseThrow();
    }

}
