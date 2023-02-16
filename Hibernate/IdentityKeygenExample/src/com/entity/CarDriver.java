package com.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CarDriver {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cdid;
	
	@Column(name = "CarDriverName",nullable = false,unique = true)
	private String cdname;
	
	private String address;

	public int getCdid() {
		return cdid;
	}

	public void setCdid(int cdid) {
		this.cdid = cdid;
	}

	public String getCdname() {
		return cdname;
	}

	public void setCdname(String cdname) {
		this.cdname = cdname;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "CarDriver [cdid=" + cdid + ", cdname=" + cdname + ", address=" + address + "]";
	}
	
	
}
