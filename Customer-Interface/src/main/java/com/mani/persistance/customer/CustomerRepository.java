package com.mani.persistance.customer;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import com.mani.data.Customer;


public interface CustomerRepository extends CrudRepository<Customer, Integer> {

	List<Customer> findByCity(String city);

	/*
	 * @Query("select c from Customer c where c.city = :city") Stream<Customer>
	 * findByCityReturnStream(@Param("city") String city);
	 */
	// List<Customer> findByDate(Date date);

	// @Query("select c from Customer c")
	// Stream<Customer> findAllAndStream();

	// List<Customer> findByDateBetween(Date from, Date to);

}
