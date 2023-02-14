package keySetmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class entryset {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(11, "A");
		map.put(12, "B");
		map.put(13, "C");
		map.put(14, "D");
		map.put(15, "E");
		System.out.println(map);

		System.out.println("ENTRYSET");
		Set<Map.Entry<Integer, String>> key = map.entrySet();
		System.out.println("********USING ITERTOR INTERFACE******");
		Iterator<Map.Entry<Integer, String>> itr = key.iterator();
		while (itr.hasNext()) {
			Entry<Integer, String> values = itr.next();
			System.out.println(values.getKey() + " " + values.getValue());
		}
		System.out.println("**************FOREACH LOOP****************");
		for (Entry<Integer, String> values : key) {
			System.out.println(values.getKey() + " " + values.getValue());
		}
	}
}
