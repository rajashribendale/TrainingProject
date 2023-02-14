package exceptionHanldingWay;

public class test {
	public static void main(String[] args) {
		System.out.println("main method");
		try {
			System.out.println("outer try block");
			int i = 10 / 0;
			System.out.println(i);
			try {
				System.out.println("Inner try block");
				int j = 10 / 2;
				System.out.println(j);
				System.out.println("Exit inner try block");

			} catch (Exception e) {
				System.out.println("outer catch block");
				e.printStackTrace();
			}

		} catch (Exception e) {
			System.out.println("Outer catch block");
			System.out.println("catch block");

			e.printStackTrace();
			try {
				System.out.println("Inner catch try block");
				int f = 10 / 0;
				System.out.println(f);
				Integer i = new Integer("abc");
				System.out.println(i);
			} catch (Exception e) {
				System.out.println("inner catch catch block");
				e.printStackTrace();
			}

//		e.printStackTrace();
//	System.out.println(e.getMessage());
//		System.out.println(e);
//		System.out.println(e.getLocalizedMessage());
		}
	}
}
