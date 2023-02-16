package com.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import org.hibernate.annotations.DynamicUpdate;

@Entity
@DynamicUpdate
public class Person {
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", adress=" + adress + ", adhardetails=" + adhardetails + "]";
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
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private int id;
	private String name;
	private String adress;
	@OneToOne(cascade=CascadeType.ALL)
	private AdharDetails adhardetails;
	public AdharDetails getAdhardetails() {
		return adhardetails;
	}
	public void setAdhardetails(AdharDetails adhardetails) {
		this.adhardetails = adhardetails;
	}
	

}
