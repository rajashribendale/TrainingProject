package WhileLoop;

public class test {
	public static void main(String[] args) {

		System.out.println("main method");

		int a = 1;
		int add = 0;
		{

			while (a <= 5) { 
				System.out.println("started while loop   "+a);
				int c = sum(add, a);
				add=c;
				System.out.println("addition:  "+add);
			
				a++;
			}
			System.out.println("ended while loop" + add);

		}

	}

	private static int sum(int a, int b) {
		int c = a + b;
		return c;
	}
}
