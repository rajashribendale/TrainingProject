package map;

import java.util.HashMap;
import java.util.Map;

public class hashmap {
public static void main(String[] args) {
	Map<Integer , String> map=new HashMap<Integer,String>();
	map.put(11, "A");
	map.put(12, "B");
	map.put(13, "C");
	map.put(11, null);
	map.put(null, "n");
	System.out.println(map.size());
	System.out.println(map);
	System.out.println(map.get(11));//null
	System.out.println(map.get(13));
	System.out.println(map.equals(map));
	System.out.println(map.isEmpty());
	
}
}
