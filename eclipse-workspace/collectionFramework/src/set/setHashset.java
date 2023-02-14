package set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class setHashset {
public static void main(String[] args) {
	Set<Integer> set=new HashSet<>();
	set.add(11);
	set.add(20);
	set.add(30);
	set.add(40);
	set.add(50);
	set.add(null);
	set.add(40);
	set.add(30);
	set.add(null);
	System.out.println(set);
	System.out.println(set.size());
	System.out.println(set.isEmpty());
	System.out.println(set.contains(50));
	System.out.println("using iterator interface------");
Iterator<Integer> itr	=set.iterator();
while(itr.hasNext())
{
	Integer i=itr.next();
	System.out.println(i);
}
System.out.println("----using foreach loop-----");
for(Integer i :set) {
	System.out.println(i);
}
}
}
