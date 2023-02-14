package WhileLoop;

public class factorialNumber {
	public static void main(String[] args) {

		int i = 1;       // 1 2 3 4 5 =1*2*3*4*5=120
		long fact = 1;
		while (i <= 5) {
			System.out.println("started while loop value of i:    " + i);
			System.out.println("multiplication: " + fact);

			fact = fact * i;
			System.out.println("factorial value is  " + fact);
			i++;

		}
		System.out.println("factorial of no is" + fact);

	}
}
