package com.projectSetterGetterMethod;

public class PenDetails {

	public Pen GetPenDetails() {
		Pen p = new Pen();
		p.setNo(10);
		p.setColor("Red");
		System.out.println("No Of Pen:"+p.getNo());
		System.out.println("color:"+p.getColor());
		return (p);

	}

	public PenPouch GetPenPouchDetails() {
		PenPouch pp=new PenPouch();
	    pp.getP1().setNo(11);
		pp.getP1().setColor("black");
		System.out.println("No Of Pen In Pouch" +pp.getP1().getNo());
		System.out.println("Color:"+pp.getP1().getColor());
		
		
		pp.getP2().setNo(12);
		pp.getP2().setColor("Blue");
		System.out.println("No Of Pen inPouch:"+pp.getP2().getNo());
		System.out.println("color:"+pp.getP2().getColor());
		return (pp);
	}

	public static void main(String[] args) {
		PenDetails pd = new PenDetails();
		Pen P = pd.GetPenDetails();
		 PenPouch PP=pd.GetPenPouchDetails();
		
		
		

	}

}
