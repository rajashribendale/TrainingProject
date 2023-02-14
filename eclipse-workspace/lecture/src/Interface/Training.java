package Interface;

public class Training implements JavaClass {

	@Override
	public void m() {
		String name = "Nilesh sir";

		System.out.println("Trainer of lecture session:  " + name);
	}

	@Override
	public void m1() {
		String name2 = "Ajay sir";
		System.out.println("Trainer of practical session:   " + name2);

	}

	@Override
	public void m2() {
		String name3 = "Punam mam";
		System.out.println("Trainer of rivision Session:  " + name3);

	}

	public static void main(String[] args) {
		JavaClass jc = new Training();
		System.out.println(batchno);
		System.out.println(institutename);
		jc.m();
		jc.m1();
		jc.m2();
	}

}
