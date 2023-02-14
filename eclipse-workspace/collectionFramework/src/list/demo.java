package list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class demo {
	public static void main(String[] args) {

		System.out.println("*****************");
		List<String> al2 = new ArrayList<String>();
		al2.add("A");
		al2.add("B");
		al2.add("C");
		al2.add("D");
		al2.add("E");

		System.out.println(al2);
		Iterator<String> itr2 = al2.iterator();
		System.out.println("**Using while loop***");
		while (itr2.hasNext()) {

			String s = itr2.next();
			System.out.println(s);
		}

		System.out.println("***Using for each loop ");
		for (String name : al2) {
			System.out.println(name);

		}
	}
}