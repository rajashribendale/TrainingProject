package mix;

import java.util.Scanner;

public class Institute {
	public void m() {
		

		
		Scanner sc=new Scanner(System.in);
		int a1=sc.nextInt();
		int b=sc.nextInt();
		
		
		 int max=(a1>b) ? a1: b;
		 
		 System.out.println(max);
		 if (a1>b)
		 {
			 System.out.println("a is greater");
			 
		 }else
		 {
			 System.out.println("b is greater");
		 }
		
//		student s=new student();
//		s.setId(11);
//		s.setAdress("pune");
//		s.setAdress("Abc");
//		
//		System.out.println(s.getId());
//		System.out.println(s.getAdress());
//		System.out.println(s.getName());
	}
	
	public static void main(String[] args) {
		Institute i=new Institute();
		i.m();
	}

}
