package swappingProgramm;

import java.util.Scanner;
//a=7 b=6
public class withoutusingthirdvariable {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first no");
		int a=sc.nextInt();
		System.out.println("Enter second no");
		int b=sc.nextInt();
		System.out.println("Before swapping "+a+" "+b);
		a=a+b;//7+6=13
		b=a-b;//13-6=7
		a=a-b;//13-7=6
		System.out.println("After swapping  "+a+" "+b);
		
	}

}
