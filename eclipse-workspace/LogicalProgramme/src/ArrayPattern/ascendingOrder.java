package ArrayPattern;

public class ascendingOrder {
	public static void main(String[] args) {
		System.out.println("TEST 2");

		int a[] = { 3, 5, 7, 65, 45, 23, 13 };
		System.out.println("Array element");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) 
			{
				if (a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.print("\nAfter sorting ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
	}
}