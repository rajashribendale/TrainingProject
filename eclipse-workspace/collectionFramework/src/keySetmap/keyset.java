package keySetmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import set.mainclass;

public class keyset {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(11, "A");
		map.put(12, "B");
		map.put(13, "C");
		map.put(14, "D");
		map.put(15, "E");
		System.out.println(map);

		System.out.println("KEYSET");
		Set<Integer> keys = map.keySet();
		System.out.println(keys);
Iterator<Integer >itr=keys.iterator();
	while(itr.hasNext()) {
		Integer values=itr.next();
		System.out.println(values+" -"+map.get(values));
//		System.out.println(map.get(values));
	}
	System.out.println("*************USING FOREACH LOOP*****");
	for(Integer values :keys) {
		System.out.println(values+" -"+map.get(values));
	}
	
	}
}
