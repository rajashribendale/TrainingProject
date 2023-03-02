package com.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;

@Entity
@NamedNativeQueries({
	@NamedNativeQuery(name="insert",query="insert into student(id,name,adress,marks)values(?,?,?,?)"),
	@NamedNativeQuery(name="singledata",query="select* from student where id=?",resultClass = student.class),
	@NamedNativeQuery(name = "likeQuery",query = "select * from student where name like 'B%'",resultClass = student.class),
	@NamedNativeQuery(name = "customQuery",query = "select name,marks from student where id=?"),
	@NamedNativeQuery(name = "customQuery1",query = "select name,marks from student"),
	@NamedNativeQuery(name = "count1",query = "select count(*) from student"),
	@NamedNativeQuery(name = "maxmarks",query = "select max(marks) from student"),
	
	
	
})
public class student {

	@Override
	public String toString() {
		return "student [id=" + id + ", name=" + name + ", Adress=" + Adress + ", marks=" + marks + "]";
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
		return Adress;
	}
	public void setAdress(String adress) {
		Adress = adress;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
private int id;
private String name;
private String Adress;
private int marks;

}
