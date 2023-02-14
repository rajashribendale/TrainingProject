package Interface;

public class A implements JavaClass {

	@Override
	public void m() {
		int no = 10;
		System.out.println("opps concepts clear by  ");
		System.out.println(no);

	}

	@Override
	public void m2() {

		System.out.println("loops completed by ");

	}

	public static void main(String[] args) {
		A a = new A();
		a.m();
		System.out.println(a.name);
		a.m2();
		System.out.println(a.name1);

	}
}
