package com.Exponent.classmgmtSyst.Model;

public class student {
private int sid;
private String sname;
private Batch batch;
public int getSid() {
	return sid;
}
public void setSid(int sid) {
	this.sid = sid;
}
public String getSname() {
	return sname;
}
public void setSname(String sname) {
	this.sname = sname;
}
public Batch getBatch() {
	return batch;
}
public void setBatch(Batch batch) {
	this.batch = batch;
}
@Override
public String toString() {
	return "student [sid=" + sid + ", sname=" + sname + ", batch=" + batch + "]";
}

}
