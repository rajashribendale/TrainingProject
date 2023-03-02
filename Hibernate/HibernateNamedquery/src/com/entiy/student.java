package com.entiy;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@Entity
@NamedQueries({
	@NamedQuery(name = "allstudent",query = "from student"),
	@NamedQuery(name = "singleStudent",query = "from student where id=:i"),
	@NamedQuery(name = "stuname",query = "from student where name=:n"),
	@NamedQuery(name="update",query="update student set name=:n,adress=:a,marks=:m where id=:i"),
	
	

})

public class student {
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
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	@Override
	public String toString() {
		return "student [id=" + id + ", name=" + name + ", marks=" + marks + ", adress=" + adress + "]";
	}
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String name;
	private int marks;
	private String adress;
	
	
	

}
