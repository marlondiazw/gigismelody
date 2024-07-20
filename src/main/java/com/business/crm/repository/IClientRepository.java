package com.business.crm.repository;

import com.business.crm.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface IClientRepository extends JpaRepository<Customer, Long> {
}
