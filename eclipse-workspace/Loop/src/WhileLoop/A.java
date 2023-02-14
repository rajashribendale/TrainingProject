package WhileLoop;

import java.util.Scanner;

public class A {

	public static void main(String[] args) {

		System.out.println("enter no above 10");
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();

		int i = 10;
		int sum = 0; 
		while (i <= s) { //10<=12
			System.out.println("while loop started " + i);
			sum = sum + i;
			System.out.println("sum is " + sum);
			i++;

		}
		System.out.println("total sum: " + sum);
	}

}
