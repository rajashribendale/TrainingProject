package com.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class student {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator = "mysql")
	@SequenceGenerator(name="mysql",allocationSize = 1,initialValue = 50)
	private int id;
	private String name;
	private String adress;
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
	@Override
	public String toString() {
		return "student [id=" + id + ", name=" + name + ", adress=" + adress + "]";
	}

}
