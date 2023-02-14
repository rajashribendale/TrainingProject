package ArrayPattern;

public class revArray {
public static void main(String[] args) {
	int a[]= {11,12,13,14,15,16};
	System.out.println("Array element");
	for (int i = 0; i < a.length; i++) {
		
		System.out.println(a[i]+"");
	}
	System.out.println("reversse Array element");
	for (int i =a.length-1; i>=0;i--) {
		System.out.println(a[i]);
		
	}
}
}
