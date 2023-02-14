package collectionsClass;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;

public class failsafe {

	public static void main(String[] args) {

		List<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		System.out.println(al);

		// fail fast
		Iterator<Integer> itr = al.iterator();
		while (itr.hasNext()) {
			// al.add(80);
			System.out.println(itr.next());
		}

		// jdk 1.5 fail safe
		// CopyOnWriteArrayList<E>
		// CopyOnWriteArraySet<E>
		// ConcurrentLinkedDeque<E>

		CopyOnWriteArrayList<Integer> al2 = new CopyOnWriteArrayList<Integer>();
		al2.add(50);
		al2.add(60);
		al2.add(70);
		Iterator<Integer> itr2 = al2.iterator();
		while (itr2.hasNext()) {
			al2.add(90);
			System.out.println(itr2.next());
		}

		System.out.println(al2);
	}
}