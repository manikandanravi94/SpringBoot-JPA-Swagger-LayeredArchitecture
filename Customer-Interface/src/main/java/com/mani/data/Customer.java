package com.mani.data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name = "customer")
public class Customer {

	// http://www.oracle.com/technetwork/middleware/ias/id-generation-083058.html
	/*
	 * @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CUST_SEQ")
	 * 
	 * @SequenceGenerator(sequenceName = "customer_seq", initialValue = 1,
	 * allocationSize = 1, name = "CUST_SEQ")
	 */
	@Id
	@Column(name = "customer_id")
	@SequenceGenerator(name="seq",sequenceName="customer_seq")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seq")
	private Integer id;
	@Column(name = "customer_name")
	private String customerName;
	@Column(name = "city")
	private String city;

	/*
	 * //@Temporal(TemporalType.DATE)
	 * 
	 * @Column(name = "CREATED_DATE") Date date;
	 */

	public Customer(Integer id, String name, String city) {
		this.id = id;
		this.customerName = name;
		this.city = city;
	}

	public Customer() {
	}

	@Override
	public String toString() {
		return "Customer{" + "id=" + id + ", customer_name='" + customerName + '\'' + ", city=" + city + '}';
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

}
