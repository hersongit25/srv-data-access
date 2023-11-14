package com.mdm.srvdataaccess.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity(name="customer")
@Table(name="customer")
public class Customer {

	@Id
//	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	private int id;
	@Column(name="name")
	private String name; 
	@Column(name="lastname")
	private String lastname;
	
	public Customer() {		// default constructor mandatory for hibernate
	}
	
	public Customer(int id, String name, String lastname) {
		this.id = id;
		this.name = name;
		this.lastname = lastname;
	}
	
	@Override
	public String toString() {
		return "Customer id:"+id+" firstName:"+name+" lastName:"+lastname;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

}
