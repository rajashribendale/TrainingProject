package com.example.demo.model;

import java.util.ArrayList;
import java.util.List;

public class District {
	private String dname;

	private List<city> cities = new ArrayList<city>();

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public List<city> getCities() {
		return cities;
	}

	public void setCities(List<city> cities) {
		this.cities = cities;
	}

	@Override
	public String toString() {
		return "District [dname=" + dname + ", cities=" + cities + "]";
	}


}
