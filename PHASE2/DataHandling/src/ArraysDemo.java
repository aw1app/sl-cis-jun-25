
public class ArraysDemo {

	public static void main(String[] args) {

		// Declare and initialize an integer array with 10 elements
		int[] myArray = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };

		// Access and print the second element of the array
		System.out.println("Access and print the second element of the array");
		System.out.println(myArray[1]);

		// 
		System.out.println("Looping through the full array:");
		for (int i = 0; i < myArray.length; i++) {
			System.out.print(myArray[i] + "\t");
		}

	}

}
