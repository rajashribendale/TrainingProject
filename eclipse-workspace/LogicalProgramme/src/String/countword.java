package String;

public class countword {
public static void main(String[] args) {
	String s="exponent training ";
	int count=0;
	for (int i = 0; i < args.length; i++) {
//		if((s.charAt(i)==' ')&& s.charAt(i)!=' ')
//		{
//			count ++;
//		}
//	}
//	System.out.println("no of word in given string "+count );
//	
	
	if(s.charAt(i)=='a' || s.charAt(i)=='e'|| s.charAt(i)=='i' 
			|| s.charAt(i)=='o' || s.charAt(i)=='u')
	{
		count ++;
		
	}
	System.out.println(" no of vowel in string "+count);
}

}