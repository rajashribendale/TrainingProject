package swappingProgramm;

import java.util.Scanner;

public class usingthirdvariable {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first no");
		int a=sc.nextInt();
		System.out.println("Enter second no");
		int b=sc.nextInt();
		System.out.println("Before swapping "+a+" "+b);
		int c;
		c=a;
		a=b;
		b=c;
		System.out.println("After swapping  "+a+" "+b);
		
	}

}
