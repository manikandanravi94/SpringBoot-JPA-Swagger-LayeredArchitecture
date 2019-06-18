package com.mani.persistance.customer;

import java.util.List;


import com.mani.data.Customer;

public interface ICustomerFinderRepository {
	
	
	public List<Customer> findByCity(String city);
	
}
