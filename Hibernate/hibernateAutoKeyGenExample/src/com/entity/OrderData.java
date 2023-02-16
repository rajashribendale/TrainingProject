package com.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class OrderData {
	public int getOid() {
		return oid;
	}
	public void setOid(int oid) {
		this.oid = oid;
	}
	public String getOname() {
		return oname;
	}
	public void setOname(String oname) {
		this.oname = oname;
	}
	
	@Override
	public String toString() {
		return "OrderData [oid=" + oid + ", oname=" + oname + ", omaode=" + omaode + "]";
	}

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
private int oid;
private String oname;
private String omaode;
public String getOmaode() {
	return omaode;
}
public void setOmaode(String omaode) {
	this.omaode = omaode;
}
}
