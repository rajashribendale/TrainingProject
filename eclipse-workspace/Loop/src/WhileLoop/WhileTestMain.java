package WhileLoop;


public class WhileTestMain {

	public static void main(String[] args) {
		System.out.println("Main method started-------");
//		m1();//1
//		m1();//2
//		m1();//3
//		m1();//4
//		m1();//5
//		boolean flag = false;
//		
//		while(flag) {
//			System.out.println("Inside while ---");
//			m1();
//			flag = false;
//		}
//		System.out.println("*******");
//		int i =1;
//		while(i<=10) {//1<=5 --> true, 2<=5 -->true, 3<=5, 4<=5, 5<=5, 6<=5 --false
//			System.out.println("Inside while ---"+i);
//			m1();
//			i= i+1;// =1+1  i=2, 2+1 , i= 3, i =4, i=5, i=6
//		}
//		System.out.println("*********");
		
		int j =1;
		int add = 0;
		while(j<=10) {
			add = sum(add, j);	
			j++;// j= j+1;
		}
		System.out.println("Sum is :"+add);
		
		// 1,2,3,4,5
	//0+1=1	1+2=3, 3+3=6, 6+4=10, 10+5=15
		
		System.out.println("Main method Completed-------");
	}
	
	private static void m1() {
		System.out.println("m1 method called....");
	}
	
	private static int sum(int a, int b) {
		int c  = a+b;
		return c;
	}
	
	
}