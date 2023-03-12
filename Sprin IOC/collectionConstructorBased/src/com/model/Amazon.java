package com.model;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Amazon {

	private int id;
	
	private List<String> elec;
	
	private Set<String> books;
	
	private Map<Integer, String> map;

	public Amazon(int id, List<String> elec, Set<String> books, Map<Integer, String> map) {
		super();
		this.id = id;
		this.elec = elec;
		this.books = books;
		this.map = map;
	}

	@Override
	public String toString() {
		return "Amazon [id=" + id + ", elec=" + elec + ", books=" + books + ", map=" + map + "]";
	}

	

}
