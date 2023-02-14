package starlogic;

public class alphabet {
	public static void main(String[] args) {

		char ch = 'A';
		for (int i = 0; i <= 6; i++) {
			for (int j = 0; j <= i; j++) {

				System.out.print(" " + ch);
				ch++;
			}
			System.out.println();
		}
		
System.out.println("***************************");
		int aplhabet = 65;

		for (int i = 0; i <= 25; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print((char) (aplhabet + j) + "");

			}
			System.out.println();
		}
	}
}
