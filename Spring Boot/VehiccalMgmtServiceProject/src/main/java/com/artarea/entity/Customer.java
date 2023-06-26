package com.artarea.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.Data;

@Entity
@Data
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cid;
	
	private String name;
	
	private String mobileNo;
	
	private String emailId;
	
	private String pancard;
	
	private String adharcard;
	
	private String createdby;
	
	//employee field
	
	private String empname;
	
	private double salary;
	
	private String experience;
	
	private String designation;
	
			
	@OneToOne(cascade = CascadeType.ALL)
	private address adress;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Role role;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Login login;
	

}
