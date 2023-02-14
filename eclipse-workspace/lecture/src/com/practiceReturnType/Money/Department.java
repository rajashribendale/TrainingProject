package com.practiceReturnType.Money;

public class Department {
	
	
	public void DisplayNoteDetails()
	{
		Collection c=new Collection();
		Note N=c.addnoteInfo();
		System.out.println("Display Note Information");
		System.out.println(N.no);
		System.out.println(N.color);
		
		
	}
	public static void main(String[] args) {
		
		Department d=new Department();
		d.DisplayNoteDetails();
	}

}
