package com.mani.customerapp.service.customer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.mani.core.customer.ICustomerFinder;
import com.mani.core.customer.ICustomerPersister;
import com.mani.types.internal.customer.CustomerDTO;
import com.mani.types.internal.response.CustomerResponse;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping(value="/customer")
@Api(value = "Customer Resource")
public class CustomerService {

	@Autowired
	private ICustomerFinder customerService;
	
	@Autowired
	private ICustomerPersister customerPersister;

	@ApiOperation(value="List of customer so far registered")
	@RequestMapping(value = "/getCustomerList", method = RequestMethod.GET)
	public List<CustomerDTO> getCustomerList(@RequestParam String city) {
		System.out.println("Ëntered controller");
		return customerService.getCustomerList(city);
	}
	@ApiOperation(value="To add the particular customer to our datalist")
	@ApiResponses(
			value=
			{
					@ApiResponse(code=500, message="Input parameters are wrong for internal working")
			})
	@RequestMapping(value= "/addCustomer", method=RequestMethod.POST,  produces = {"application/xml; charset=UTF-8", "application/json; charset=UTF-8"}, consumes= {"application/xml; charset=UTF-8", "application/json; charset=UTF-8"})
	public @ResponseBody CustomerResponse addCustomer(@RequestBody CustomerDTO customerDTO)
	{
		return customerPersister.addCustomer(customerDTO);
	}

}
