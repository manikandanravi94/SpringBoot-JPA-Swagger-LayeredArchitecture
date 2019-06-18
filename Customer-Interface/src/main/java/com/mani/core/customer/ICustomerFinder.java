package com.mani.core.customer;

import java.util.List;

import com.mani.types.internal.customer.CustomerDTO;

public interface ICustomerFinder {
	
	List<CustomerDTO> getCustomerList(String city);

}
