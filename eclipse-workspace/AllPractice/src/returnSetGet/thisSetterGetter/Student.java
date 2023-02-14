package returnSetGet.thisSetterGetter;

public class Student {

	Student() {
		System.out.println("Get college Details");

	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private int rollno = 11;
	private String name = "Rajshri";

}
