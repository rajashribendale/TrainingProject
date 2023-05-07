package com.example.demo.model;

public class BankAccount {
private double acNo;
	
	private String fName;
	
	private String lName;
	
	private String Email;
	
	private String panNo;

	public double getAcNo() {
		return acNo;
	}

	public void setAcNo(double acNo) {
		this.acNo = acNo;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getPanNo() {
		return panNo;
	}

	public void setPanNo(String panNo) {
		this.panNo = panNo;
	}

	@Override
	public String toString() {
		return "BankAccount [acNo=" + acNo + ", fName=" + fName + ", lName=" + lName + ", Email=" + Email + ", panNo="
				+ panNo + "]";
	}
	
}
