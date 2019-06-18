package com.mani.core.customer;

import com.mani.types.internal.customer.CustomerDTO;
import com.mani.types.internal.response.CustomerResponse;

public interface ICustomerPersister {
	
	public CustomerResponse addCustomer(CustomerDTO customerDTO);

}
