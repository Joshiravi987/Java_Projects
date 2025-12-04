package com.example.SpringNestedJson;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

	@Autowired
	private CustomerRepository customerRepository;
	
	public CustomerEntity saveCustomer(CustomerEntity entity) {
		entity.getOrderentity().forEach(order -> order.setCustomerentity(entity));
		return customerRepository.save(entity);
	}
	//fetch all customers with orders
	
 public Iterable<CustomerEntity> fetchAllCustomers(){
	 return customerRepository.findAll();
	 
 }
}
