package LinkedList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class allUniversities {
	public List<List<String>> addUniversity() {

		List<String> mumbaiuniversity = new ArrayList<String>();
		mumbaiuniversity.add("B.A");
		mumbaiuniversity.add("B.S.M");

		List<String> puneuniversity = new ArrayList<String>();
		puneuniversity.add("BSC");
		puneuniversity.add("B.E");

		List<String> shivajinagaruniversity = new ArrayList<String>();
		shivajinagaruniversity.add("MBA");
		shivajinagaruniversity.add("MCA");

		List<List<String>> alluniversities = new ArrayList<List<String>>();
		alluniversities.add(mumbaiuniversity);
		alluniversities.add(puneuniversity);
		alluniversities.add(shivajinagaruniversity);
		return alluniversities;

	}

	public static void main(String[] args) {
		allUniversities all = new allUniversities();
		List<List<String>> university = all.addUniversity();

		System.out.println("using while loop");
		Iterator<List<String>> itr = university.iterator();
		while (itr.hasNext()) {
			List<String> stream = itr.next();
			System.out.println(stream);

			Iterator<String> itr2 = stream.iterator();
			while (itr2.hasNext()) {
				String str = itr2.next();
				System.out.println(str);
			}

		}
		System.out.println("**********using foreach loop*********");
		for (List<String> stream : university) {
			for (String str : stream) {
				System.out.println(str);
			}
		}
	}

}
