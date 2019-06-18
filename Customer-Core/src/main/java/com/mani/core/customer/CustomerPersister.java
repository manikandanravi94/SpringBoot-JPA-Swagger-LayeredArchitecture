package com.mani.core.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mani.data.Customer;
import com.mani.persistance.customer.ICustomerAddRepository;
import com.mani.types.internal.customer.CustomerDTO;
import com.mani.types.internal.response.CustomerResponse;

@Service
public class CustomerPersister implements ICustomerPersister {
	
	@Autowired
	private ICustomerAddRepository customerAddRepository;

	@Override
	public CustomerResponse addCustomer(CustomerDTO customerDTO) {
		// TODO Auto-generated method stub
		CustomerResponse customerResponse = new CustomerResponse();
		Customer customer= new Customer();
		customer.setId(customerDTO.getId());
		customer.setCustomerName(customerDTO.getCustomerName());
		customer.setCity(customerDTO.getCustomerCity());
		try {
		if(customerAddRepository.addCustomer(customer).getCustomerName().equals(customerDTO.getCustomerName()))
		{
			customerResponse.setStatusCode(200);
			customerResponse.setDescription("success");
		}
		else
		{
			customerResponse.setStatusCode(500);
			customerResponse.setDescription("success");
		}
		}catch(Exception e)
		{
			System.out.println("thrown at service layer"+e);
		}
		return customerResponse;
	}

}
