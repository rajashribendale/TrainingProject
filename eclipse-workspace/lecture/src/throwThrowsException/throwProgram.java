package throwThrowsException;

import java.util.Scanner;

public class throwProgram {

	public static void ValidateAge(int age) {
		System.out.println("inside method");
		if(age<18) 
		{
			throw new ArithmeticException("person is not eligible to create the "
					+ "bank account ,please visit again after completing age 18");
			
		}else {
			System.out.println("person is eligible for creating bank account ");
			
			
		}
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter your age");
		int age=sc.nextInt();
		try {
			ValidateAge(age);
		}catch(ArithmeticException e) {
			System.out.println(e);
		}
	}

}
