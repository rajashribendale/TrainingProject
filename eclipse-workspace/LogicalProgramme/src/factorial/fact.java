package factorial;

import java.util.Scanner;

public class fact {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("enter the no to find factorial");
		int fact = 1;
		for (int i = 1; i <= n; i++) {
			fact = fact * i;
			System.out.println("factorial of no:" + fact);

		}

		System.out.println("factorial is:" + fact);

	}
}