package ArrayPattern;

public class sortSecondHighestele { 
	
	public static void main(String[] args) {
		int a[] = { 11, 12, 13, 14, 15, 16 };
		int size=a.length;
		System.out.println("Array element");
		for (int i = 0; i < a.length; i++) {

			System.out.println(a[i] + "");
		}
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if (a[i] < a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;

				}
			}
		}
		System.out.println("array element after sorting ");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i] + "");
		}
		System.out.println("second largest element" + a[size - 2]);
	}
}
