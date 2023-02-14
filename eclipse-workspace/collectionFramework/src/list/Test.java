package list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		List al=new ArrayList();
		al.add(101);
		al.add(201);
		al.add(205);
		al.add(66);
		al.add(205);
		al.add(66);
		al.add(null);
		al.add(null);
		
		
		System.out.println(al);
		System.out.println(al.size());
		System.out.println(al.isEmpty());
		System.out.println("contains:"+al.contains(201));
		System.out.println(al.get(5));
		System.out.println(al.get(4));
		System.out.println(al.remove(1));
		
		System.out.println(al);

		List a2=new ArrayList<>();
		a2.add(101);
		a2.add(201);
		a2.add(205);
		a2.add(66);
		a2.add(205);
		a2.add(66);
		a2.add(null);
		a2.add(null);
		
		System.out.println(a2);
		
		if(al.equals(a2))
			System.out.println("equal");
		
		else 
				System.out.println("not equal");
		
	}

}
