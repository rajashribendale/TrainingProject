package com.example.demo.model;

import java.util.ArrayList;
import java.util.List;

public class city {

	private String cname;

	private List<villege>villeges = new ArrayList<villege>();

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public List<villege> getVilleges() {
		return villeges;
	}

	public void setVilleges(List<villege> villeges) {
		this.villeges = villeges;
	}

	@Override
	public String toString() {
		return "city [cname=" + cname + ", villeges=" + villeges + "]";
	}

}
