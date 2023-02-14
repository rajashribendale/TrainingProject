package com.Exponent.classmgmtSyst.Model;

public class Batch {
private int bid;
private String bname;
private faculty faculty;
public int getBid() {
	return bid;
}
public void setBid(int bid) {
	this.bid = bid;
}
public String getBname() {
	return bname;
}
public void setBname(String bname) {
	this.bname = bname;
}
public faculty getFaculty() {
	return faculty;
}
public void setFaculty(faculty faculty) {
	this.faculty = faculty;
}
@Override
public String toString() {
	return "Batch [bid=" + bid + ", bname=" + bname + ", faculty=" + faculty + "]";
}

}
