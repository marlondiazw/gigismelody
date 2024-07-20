package com.business.crm;

import com.business.crm.model.Customer;
import com.business.crm.model.Order;
import com.business.crm.repository.IClientRepository;
import com.business.crm.repository.IOrderRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@SpringBootApplication
public class GigismelodyApplication implements CommandLineRunner {

	@Bean
	public ModelMapper modelMapper() {
		return new ModelMapper();
	}

	@Autowired
	private IOrderRepository orderRepository;
	@Autowired
	private IClientRepository clientRepository;
	public static void main(String[] args) {
		SpringApplication.run(GigismelodyApplication.class, args);
	}
	@Transactional
	@Override
	public void run(String... args) throws Exception {
		List<Order> orders = orderRepository.findAll();
		List<Customer> clients = clientRepository.findAll();
		clients.forEach(x -> System.out.println(x.getName()));
	}
}
