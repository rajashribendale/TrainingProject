package com.Pojo;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Student {

	private int id;
	private String name;
	private String adress;

	private List<College> list;

	private Set<String> set;
	private Map<Integer, String> map;

	public int getId() {
		return id;
	}

	public Map<Integer, String> getMap() {
		return map;
	}

	public void setMap(Map<Integer, String> map) {
		this.map = map;
	}

	public Set<String> getSet() {
		return set;
	}

	public void setSet(Set<String> set) {
		this.set = set;
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

	public List<College> getList() {
		return list;
	}

	public void setList(List<College> list) {
		this.list = list;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", adress=" + adress + ", list=" + list + ", set=" + set
				+ ", map=" + map + "]";
	}

}
