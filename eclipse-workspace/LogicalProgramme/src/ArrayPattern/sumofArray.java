package ArrayPattern;

public class sumofArray {
public static void main(String[] args) {
	int a[] = { 3, 5, 7, 65, 45, 23, 13 };
	System.out.println("Array element");
	for (int i = 0; i < a.length; i++) {
		System.out.print(a[i]+" ");
	}
	int sum=0;
	for (int i = 0; i < a.length; i++) {
		
		 sum=sum+a[i];
		System.out.println("\nsum of element in array "+sum);
	}
}
}
