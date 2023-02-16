package com;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="emp1")
public class Employee {
@Id	
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
	return "Employee [id=" + id + ", name=" + name + ", adress=" + adress + "]";
}

}
