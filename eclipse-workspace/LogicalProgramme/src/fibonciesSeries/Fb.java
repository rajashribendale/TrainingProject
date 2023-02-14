package fibonciesSeries;

import java.util.Scanner;

public class Fb {

	// 0112358
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter no");
		int n = sc.nextInt();
		int a = 0, b = 1, c;
		System.out.println("fiboncies series is ");
		System.out.print(a + " " + b);

		for (int i = 2; i <= n; i++) {

			c = a + b;// 0+1=1//1+1=2//2+1
			System.out.print("  " + c);// 1
			a = b;//
			b = c;// 1,1
		}

	}

}
