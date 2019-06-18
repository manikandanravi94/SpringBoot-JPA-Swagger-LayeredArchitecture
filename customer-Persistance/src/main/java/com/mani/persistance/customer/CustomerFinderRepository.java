package com.mani.persistance.customer;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.mani.persistance.customer.CustomerRepository;
import com.mani.data.Customer;

@Repository
public class CustomerFinderRepository implements ICustomerFinderRepository {

	@Autowired
	private CustomerRepository customerRepository;
	
	

	public List<Customer> findByCity(String city) {
		return customerRepository.findByCity(city);
	}

}
