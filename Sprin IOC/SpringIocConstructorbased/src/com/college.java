package com;

public class college {
	private int cid;
	private String cname;
	private String  cadress;
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getCadress() {
		return cadress;
	}
	public void setCadress(String cadress) {
		this.cadress = cadress;
	}
	@Override
	public String toString() {
		return "college [cid=" + cid + ", cname=" + cname + ", cadress=" + cadress + "]";
	}
	

}
