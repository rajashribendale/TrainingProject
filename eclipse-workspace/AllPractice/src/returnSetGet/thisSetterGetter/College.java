package returnSetGet.thisSetterGetter;

public class College extends Student {

	String adress = "pune";

	College() {
		this(11);

		System.out.println(this.adress);
	}

	College(int i) {
		System.out.println("Get Students Details");
	}

	public static void main(String[] args) {
		College c = new College();
		System.out.println(c.getRollno());
		System.out.println(c.getName());
		
		Student s=new Student();
		s.setName("Indira College");
		System.out.println(s.getName());
	}
}
