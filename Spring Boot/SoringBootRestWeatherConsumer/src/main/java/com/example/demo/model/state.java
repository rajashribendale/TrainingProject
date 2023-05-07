package com.example.demo.model;

import java.util.ArrayList;
import java.util.List;

public class state {
	private String sname;

	private List<District> districts = new ArrayList<District>();

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public List<District> getDistricts() {
		return districts;
	}

	public void setDistricts(List<District> districts) {
		this.districts = districts;
	}

	@Override
	public String toString() {
		return "state [sname=" + sname + ", districts=" + districts + "]";
	}


}
