package com.model;

public class College {
	private int cid;
	private String cname;
	private String cadress;


	public College(int cid, String cname, String cadress) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.cadress = cadress;
	}


	@Override
	public String toString() {
		return "College [cid=" + cid + ", cname=" + cname + ", cadress=" + cadress + "]";
	}
	

}
