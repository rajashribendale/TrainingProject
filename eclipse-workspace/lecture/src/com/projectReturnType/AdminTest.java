package com.projectReturnType;

public class AdminTest {

	public void displaypendetails() {
		PenDetails pd = new PenDetails();
		Pen p = pd.GetpenDetails();
		System.out.println("p.no" + p.no);
		System.out.println("pencolor:" + p.name);
	}

	public void displaypenpouchdetails() {
		PenDetails pd = new PenDetails();
		PenPouch PP = pd.GetPenPouchDetails();

		System.out.println("pen no:" + PP.P1.no);
		System.out.println("pencolor" + PP.P1.name);
		System.out.println("pen no:" + PP.P2.no);
		System.out.println("pencolor" + PP.P2.name);
	}

	public static void main(String[] args) {
		AdminTest test = new AdminTest();
		
		test.displaypendetails();
		System.out.println("---------------------------");
		test.displaypenpouchdetails();
		

	}
}
