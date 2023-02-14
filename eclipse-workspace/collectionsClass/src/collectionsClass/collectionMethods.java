package collectionsClass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class collectionMethods {

	public static void main(String[] args) {

		List<String> names = new ArrayList<String>();
		Collections.addAll(names, "Rajshri", "Bhagyashri", "Ujjwala","Yogita");
		System.out.println(names);
		Collections.sort(names);
		System.out.println("after sorting");
		System.out.println(names);
		System.out.println("reverse");
		Collections.reverse(names);
		Collections.shuffle(names);
		Collections.synchronizedList(names);
		
	List<Integer>no=new ArrayList<Integer>();
	Collections.addAll(no,11, 20,30,40);
	System.out.println(no);
		Collections.max(no);
		// unmodified list
		names = Collections.unmodifiableList(names);
		// names.add("Vrushali");

		
		
		
		
		// Collections.unmodifiableSet(set name)

		// Collections.unmodifiableMap(map name)

		
	}
}