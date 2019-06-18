package com.mani.core.customer;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mani.data.Customer;
import com.mani.persistance.customer.ICustomerFinderRepository;
import com.mani.types.internal.customer.CustomerDTO;

@Service
public class CustomerFinder implements ICustomerFinder {

	@Autowired
	private ICustomerFinderRepository customerFinderRepository;

	public List<CustomerDTO> getCustomerList(String enteredCity) {
		// TODO Auto-generated method stub
		List<CustomerDTO> customerList = new ArrayList<CustomerDTO>();
		for (Customer customer : customerFinderRepository.findByCity(enteredCity)) {
			CustomerDTO customerDTO = new CustomerDTO();
			customerDTO.setId(customer.getId());
			customerDTO.setCustomerName(customer.getCustomerName());
			customerDTO.setCustomerCity(customer.getCity());
			customerList.add(customerDTO);
		}
		return customerList;
	}

}
