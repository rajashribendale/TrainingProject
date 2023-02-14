package StringComparision;

public class demo {
public static void main(String[] args) {
	 String s="Rajshri";
	 String s1= new String("Rajshri");
	 String s2=s;
	 String s3=new String("Rajshri");
	 String s4=new String("rajshri");
	 
	 //1 st way using equal()
	 System.out.println(s.equals(s1));
	 System.out.println(s.equals(s4));
	 System.out.println(s2.equals(s3));
	 System.out.println(s.equalsIgnoreCase(s4));
	 
	//2nd way == operator(reference , address)
		
			System.out.println(s == s2 );//true
			System.out.println(s == s1 );//true
			System.out.println(s1 == s3 );
			

}
}