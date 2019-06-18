package com.mani.persistance.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mani.data.Customer;

@Service
public class CustomerAddRepository implements ICustomerAddRepository{

	@Autowired
	private CustomerRepository customerRepository;
	
	
	@Override
	public Customer addCustomer(Customer customer) {
		// TODO Auto-generated method stub
		Customer returnCustomer=null;
		try
		{
		returnCustomer= customerRepository.save(customer);
		}catch(Exception e)
		{
			
		}
		return returnCustomer;
	}

}
