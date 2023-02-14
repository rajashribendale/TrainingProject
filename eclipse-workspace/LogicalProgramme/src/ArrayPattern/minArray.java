package ArrayPattern;

public class minArray {
	public static void main(String[] args) {
		int a[] = { 10, 20, 30, 40, 50 };

		int min = a[0];
		System.out.println("Array element is ");
		for (int j = 0; j < a.length; j++) {
			
			System.out.println(a[j] + "");
		}
		for (int j = 0; j < a.length; j++) {
			if (a[j] < min) //10 
			{
				min = a[j];
			}

		}
		System.out.println("Minimum no in array is " + min);
	}
}
