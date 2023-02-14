package com.projectSetterGetterMethod;

public class PenPouch {

	public Pen getP1() {
		return p1;
	}

	public void setP1(Pen p1) {
		this.p1 = p1;
	}

	public Pen getP2() {
		return p2;
	}

	public void setP2(Pen p2) {
		this.p2 = p2;
	}

	 private Pen p1 = new Pen();
private	Pen p2 = new Pen();

}
