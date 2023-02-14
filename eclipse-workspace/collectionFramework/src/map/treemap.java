package map;

import java.util.Map;
import java.util.TreeMap;
//ascending order
public class treemap {
public static void main(String[] args) {
	Map<String ,Integer >map=new TreeMap<String ,Integer>();
	map.put("A", 11);
	map.put("B", 12);
	map.put("C",10);
	
//	map.put("C", null);
//	map.put(null, null);//null value not allowed
	System.out.println(map);
	
	Map<Integer , String>map2=new TreeMap<Integer,String>();
	map2.put(11, "Rajshri");
	map2.put(13, "shraddha");
	map2.put(12, "Asmita");
	System.out.println(map2);
}
}