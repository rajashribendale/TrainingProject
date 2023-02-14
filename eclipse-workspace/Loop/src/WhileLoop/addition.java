package WhileLoop;

public class addition {

	public static void main(String[] args) {

		int a = 1;
		int add = 0;
		{
			while (a <= 10) {  //1<=10==true
				System.out.println("started loop:" + a);

				add = add + a; //add=0+1=1

				a++;
			}
			System.out.println("addition:  " + add);

		}

	}

}
