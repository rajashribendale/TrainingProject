package throwThrowsException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.SocketException;
public class ThrowsExample {
	// rajshri - write (leave company )
	// uady - use(replace rajshri)he know where xeception occure
	public static void findFile() throws FileNotFoundException, IOException,
			ArithmeticException, NullPointerException, SocketException {
		File file = new File("text.txt");
		FileInputStream in = new FileInputStream(file);
		System.out.println(in.available());
		System.out.println(in.read());
		// 500
		// 25 exception
	}
	public static void main(String[] args) {
		try {
			findFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("main method ");
	}
}