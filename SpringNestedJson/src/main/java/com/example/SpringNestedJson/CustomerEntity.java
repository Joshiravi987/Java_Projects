package com.example.SpringNestedJson;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity

public class CustomerEntity {
	@Id
	@GeneratedValue
private int cust_id;
@Column
private String cust_name;
@OneToMany(cascade = CascadeType.ALL, mappedBy = "customerentity")
@JsonManagedReference
private List<OrderEntity> orderentity;
public int getCust_id() {
	return cust_id;
}
public void setCust_id(int cust_id) {
	this.cust_id = cust_id;
}
public String getCust_name() {
	return cust_name;
}
public void setCust_name(String cust_name) {
	this.cust_name = cust_name;
}
public List<OrderEntity> getOrderentity() {
	return orderentity;
}
public void setOrderentity(List<OrderEntity> orderentity) {
	this.orderentity = orderentity;
	if (orderentity != null) {
		orderentity.forEach(order -> order.setCustomerentity(this));
	}
}

}
