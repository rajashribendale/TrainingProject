package com.model;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class shopkeeper {
	private int id;
	private String name;
	private List<String> clothes;
	private Set<String> brands;
	private Map<Integer, String> map;

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

	public List<String> getClothes() {
		return clothes;
	}

	public void setClothes(List<String> clothes) {
		this.clothes = clothes;
	}

	public Set<String> getBrands() {
		return brands;
	}

	public void setBrands(Set<String> brands) {
		this.brands = brands;
	}

	public Map<Integer, String> getMap() {
		return map;
	}

	public void setMap(Map<Integer, String> map) {
		this.map = map;
	}

		@Override
	public String toString() {
		return "shopkeeper [id=" + id + ", name=" + name + ", clothes=" + clothes + ", brands=" + brands + ", map="
				+ map + "]";
	}

}
