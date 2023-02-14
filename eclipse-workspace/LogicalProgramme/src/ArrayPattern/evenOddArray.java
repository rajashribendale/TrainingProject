package ArrayPattern;

public class evenOddArray {
	public static void main(String[] args) {
		int a[] = { 3, 4, 7, 66, 44, 23, 13 };
		System.out.println("Array element");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println("\neven Elements");
		for (int i = 0; i < a.length; i++) {

			if (a[i] % 2 == 0) {
				System.out.println(a[i]);
			}
		}
		System.out.println("Odd Elements");
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 != 0) {
				System.out.println(a[i]);
			}
		}
	}

}
