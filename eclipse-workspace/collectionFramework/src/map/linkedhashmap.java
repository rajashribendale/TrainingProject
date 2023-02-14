package map;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.StringJoiner;

public class linkedhashmap {
public static void main(String[] args) {
	Map<Integer , String>map=new LinkedHashMap<Integer ,String>();
	map.put(11, "A");
	map.put(12, "B");
	map.put(13, "c");
	map.put(11, null);
	map.put(null, null);
	map.put(14, "d");
	
	System.out.println(map);
	System.out.println(map.size());
	System.out.println(map.isEmpty());
	System.out.println(map.containsKey(11));
	
	
}
}
