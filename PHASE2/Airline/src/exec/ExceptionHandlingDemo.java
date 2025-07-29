package exec;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ExceptionHandlingDemo {

	public static void main(String[] args) {
		
		
		// Demo of unchecked exception 
		int a=10;
		int b;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("a=10; input value of b (type a non value):");
		b = sc.nextInt();
		
		int c = a/b;
		
		System.out.println("c = a/b is "+ c);
		
		
		// Demo of checked exception 
		FileReader fr = null;
		try {
			fr = new FileReader("webex.txt");
			
			int ch = fr.read();
			System.out.println("Read a char from webex.txt "+ (char) ch);
			
		} catch (FileNotFoundException e) {			
			e.printStackTrace();
		}
		catch (IOException e) {			
			e.printStackTrace();
		};
		
		System.out.println("\n End of program.");
		
		sc.close();
	}

}
