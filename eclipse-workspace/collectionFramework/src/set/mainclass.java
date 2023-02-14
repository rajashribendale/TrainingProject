package set;

import java.util.HashSet;
import java.util.Set;

public class mainclass {
	public static void main(String[] args) {

		Employee e = new Employee(11, "Rajshri");
		Employee e2 = new Employee(11, "Rajshri");
		
		Set<Employee> s = new HashSet<>();
		s.add(e);
		s.add(e2);
		System.out.println(s);
		System.out.println(s.size());

	}
}
