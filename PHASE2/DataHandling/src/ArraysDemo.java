
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
		};
		
		
		// 2d array of size 2 x 5
		System.out.println("\n2d array");
		int[][] numbers = {
				 {1, 2, 3, 4, 5},
				 {11, 12, 13, 14, 15}
				 };
		
		// How do loop thru the above array and print all the data (10 data points)
		for (int i = 0; i < numbers.length; i++) {
			 for(int j = 0; j < numbers[i].length; j++) {
			 System.out.print(numbers[i][j] + "\t");
			 }
			 System.out.println("");
		}
		

	}

}
