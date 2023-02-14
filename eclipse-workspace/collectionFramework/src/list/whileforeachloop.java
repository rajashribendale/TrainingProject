package list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class whileforeachloop {
	public static void main(String[] args) {
		List<Integer> al = new ArrayList<Integer>();
		al.add(11);
		al.add(12);
		al.add(13);
		al.add(14);
		al.add(15);

		System.out.println(al);
		System.out.println("-----Using Iterator-----");
		Iterator<Integer> itr = al.iterator();
//		while (itr.hasNext()) {
//			int i = itr.next();
//			System.out.println(i);
//		}
		System.out.println("----for each loop-----");
		for (Integer integer : al) {
			System.out.println(integer);

		}
	}

}
