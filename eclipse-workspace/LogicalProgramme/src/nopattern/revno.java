package nopattern;

import java.util.Scanner;

public class revno {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("enter the no");
		int n = sc.nextInt();
		int r, rev = 0;
		while (n > 0) {//123

			r = n % 10;// reminder 3 2 1
			rev = rev * 10 + r;//3 2 1
			n = n / 10;//12 //2 //1 0

		}
		System.out.println("reverse no is" + rev);
	}

}