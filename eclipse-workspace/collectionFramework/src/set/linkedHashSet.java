package set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class linkedHashSet {
	public static void main(String[] args) {
		
	
Set<String> str=new HashSet<>();
str.add("amol");
str.add("sanjay");
str.add("pawan");
str.add("akshay");
str.add("amol");
str.add("amol");
str.add("sanjay");
str.add(null);
System.out.println(str);

Iterator<String>itr=str.iterator();
while(itr.hasNext()) {
	String str2=itr.next();
	System.out.println(str2);
	
}
System.out.println("using for each loop ");
	for(String s:str) {
		System.out.println(s);
	}
}
}