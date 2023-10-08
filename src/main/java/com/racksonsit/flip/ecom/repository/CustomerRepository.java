package com.racksonsit.flip.ecom.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.racksonsit.flip.ecom.model.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {

}
