package com.projectReturnType;

public class PenDetails {

	public Pen GetpenDetails() {
		Pen p = new Pen();
		System.out.println("get pen details");
		p.no = 10;
		p.name = "green";
		
		
		return (p);
		
		

	}

	public PenPouch GetPenPouchDetails() {
		PenPouch PP = new PenPouch();
		PP.P1.no = 1;
		PP.P1.name = "Red";

		PP.P2.no = 2;
		PP.P2.name = "blue";
		return (PP);

	}

	
	
}
