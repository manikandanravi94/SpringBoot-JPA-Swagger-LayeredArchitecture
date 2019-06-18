package com.mani.types.internal.customer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import io.swagger.annotations.ApiModelProperty;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
		"id",
		"customerName","customerCity"
})
@XmlRootElement
public class CustomerDTO {
	@XmlElement(name="id") 
	private Integer Id;
	@XmlElement(name="customerName")
	@ApiModelProperty(notes="name of the customer")
	private String customerName;
	@ApiModelProperty(notes="customer from the city")
	@XmlElement(name="customerCity")
	private String customerCity;
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerCity() {
		return customerCity;
	}
	public void setCustomerCity(String customerCity) {
		this.customerCity = customerCity;
	}

}
