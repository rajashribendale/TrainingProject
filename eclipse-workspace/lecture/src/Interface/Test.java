package Interface;

public class Test implements A {

	@Override
	public void m1() {
		System.out.println("M1 method implemented ");
	}

	@Override
	public void m2() {
	System.out.println("m2 method implemented");
		
	}
	public static void main(String[] args) {
		
		A a=new Test();
		a.m1();
		a.m2();
		System.out.println(i);
		System.out.println(j);
		
		
		
		Test t=new Test();
		t.m1();
		t.m2();
	}

}
