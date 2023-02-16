package com.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="carname")
public class Car
{
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private int cid;
private String canme;
private String ctype;
public int getCid() {
	return cid;
}
@Override
public String toString() {
	return "Car [cid=" + cid + ", canme=" + canme + ", ctype=" + ctype + "]";
}
public void setCid(int cid) {
	this.cid = cid;
}
public String getCanme() {
	return canme;
}
public void setCanme(String canme) {
	this.canme = canme;
}
public String getCtype() {
	return ctype;
}
public void setCtype(String ctype) {
	this.ctype = ctype;
}

}
