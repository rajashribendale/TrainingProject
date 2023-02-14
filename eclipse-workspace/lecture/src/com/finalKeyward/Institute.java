package com.finalKeyward;

public class Institute extends Student{
	
	int id;
	String name;
	static String  adress="Exponent Institute";
	
	public void student() {
		
		
		Institute i=new Institute();
		i.id=101;
		i.name="rajshri";
		
		System.out.println(i.id+""+i.name+""+Institute.adress);
	}
	

	public static void main(String[] args) {
		Institute I=new Institute();
		
		I.student();
		
	}

}
