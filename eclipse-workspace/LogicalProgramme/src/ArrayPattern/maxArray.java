package ArrayPattern;

public class maxArray {
	public static void main(String[] args) {
		int a[] = { 10, 20, 30, 40, 50 };

		int max = a[0];
		System.out.println("Array element is ");
		for (int j = 0; j < a.length; j++) {
			
			System.out.println(a[j] + "");
		}
		for (int j = 0; j < a.length; j++) {
			if (a[j] > max) {
				max = a[j];
			}

		}
		System.out.println("MAx no in array is " + max);
	}
}
