package com.byName;

public class customer {
	
	private int id;
	private String name;
	private Adress adress;
	private Adress adress1;

	public customer() {
		System.out.println("cust. constrctor callled");
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

	public Adress getAdress() {
		return adress;
	}

	public void setAdress(Adress adress) {
		this.adress = adress;
	}

	public Adress getAdress1() {
		return adress1;
	}

	public void setAdress1(Adress adress1) {
		this.adress1 = adress1;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", adress=" + adress + ", adress1=" + adress1 + "]";
	}

}
