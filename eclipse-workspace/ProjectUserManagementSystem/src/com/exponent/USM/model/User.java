package com.exponent.USM.model;

public class User {
	private int id;
	private String name;
	private String address;
	private long MobNo;
	private String panCard;
	private long AdharCard;

	public String getPanCard() {
		return panCard;
	}

	public void setPanCard(String panCard) {
		this.panCard = panCard;
	}

	public long getAdharCard() {
		return AdharCard;
	}

	public void setAdharCard(long adharCard) {
		AdharCard = adharCard;
	}

	public long getMobNo() {
		return MobNo;
	}

	public void setMobNo(long mobNo) {
		MobNo = mobNo;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
